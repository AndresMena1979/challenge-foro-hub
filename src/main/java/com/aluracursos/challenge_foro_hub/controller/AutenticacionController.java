package com.aluracursos.challenge_foro_hub.controller;

import com.aluracursos.challenge_foro_hub.domain.usuarios.DatosAutenticacionUsuario;
import com.aluracursos.challenge_foro_hub.domain.usuarios.Usuario;
import com.aluracursos.challenge_foro_hub.infra.security.DatosJWTToken;
import com.aluracursos.challenge_foro_hub.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                                                        /* @RestController en Spring Boot marca una clase como un controlador web tipo REST,
                                                                          es decir, una clase que maneja solicitudes HTTP y devuelve datos en formato JSON o
                                                                          similar, en lugar de vistas HTML (como en aplicaciones MVC tradicionales). */
@RequestMapping("/login")
public class AutenticacionController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario) {  /* RequestBody,Le dice a Spring que debe tomar el cuerpo (body)
                                                                                                                           de la petición HTTP (normalmente en formato JSON) y convertirlo a un objeto Java.
                                                                                                                 @Valid Le dice a Spring que debe validar automáticamente el objeto recibido (por ejemplo,
                                                                                                                           el DTO) usando las anotaciones de validación de Bean Validation (jakarta.validation.constraints).*/
        System.out.println("valor del  Body" + datosAutenticacionUsuario);
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.login(),
        datosAutenticacionUsuario.clave());
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());


        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));

    }

}
