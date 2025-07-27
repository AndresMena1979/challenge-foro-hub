package com.aluracursos.challenge_foro_hub.controller;

import com.aluracursos.challenge_foro_hub.domain.topicos.*;
import com.aluracursos.challenge_foro_hub.domain.usuarios.Usuario;
import com.aluracursos.challenge_foro_hub.domain.usuarios.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

//-------------Registrar Topico--------------

    @PostMapping
    @Transactional
    public ResponseEntity registrarTopico(@RequestBody @Valid DatosRegistraTopico datos, UriComponentsBuilder uriComponentsBuilder) {
        Usuario usuario = usuarioRepository.findById(datos.usuario_id())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Topico topico = new Topico(
                datos.titulo(),
                datos.mensaje(),
                datos.nombre_curso(),
                usuario,
                datos.fecha_creacion()
        );

        topicoRepository.save(topico);

        var uri = uriComponentsBuilder.path("/topicos/{id}")
                .buildAndExpand(topico.getId())
                .toUri();  // <-- CORRECTO

        var datosRespuesta = new DatosRespuestaTopico(
                topico.getId(),
                topico.getMensaje(),
                topico.getNombre_curso(),
                topico.getTitulo(),
                topico.getFecha_creacion()
        );

        return ResponseEntity.created(uri).body(datosRespuesta);  // <-- Devuelve 201 Created
    }
//-------------Actualizqar el Topico-----------------------


    public TopicoController(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    @PutMapping
    @Transactional
    public ResponseEntity<DatosRespuestaTopico> actualizartopico(@RequestBody @Valid DatosActualizarTopico datosActualizarTopico) {
        var topico = topicoRepository.findById(datosActualizarTopico.id())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tópico no encontrado"));

        topico.actualizarDatos(datosActualizarTopico);

        var datosRespuesta = new DatosRespuestaTopico(
                topico.getId(),
                topico.getMensaje(),
                topico.getNombre_curso(),
                topico.getTitulo(),
                topico.getFecha_creacion()
        );

        return ResponseEntity.ok(datosRespuesta);
    }
//----- Listar Todos los Topicos

@GetMapping
public ResponseEntity<List<DatosRespuestaTopico>> listarTopicos() {
    List<Topico> topicos = topicoRepository.findAll();

    List<DatosRespuestaTopico> respuesta = topicos.stream()
            .map(topico -> new DatosRespuestaTopico(
                    topico.getId(),
                    topico.getMensaje(),
                    topico.getNombre_curso(),
                    topico.getTitulo(),
                    topico.getFecha_creacion()
            ))
            .toList();

    return ResponseEntity.ok(respuesta);
}
//---- Listar por un Topico-----------

    @GetMapping("/{id}")
    public ResponseEntity<DatosRespuestaTopico> obtenerTopicoPorId(@PathVariable Long id) {
        Topico topico = topicoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tópico no encontrado"));

        DatosRespuestaTopico datosTopico = new DatosRespuestaTopico(
                topico.getId(),
                topico.getMensaje(),
                topico.getNombre_curso(),
                topico.getTitulo(),
                topico.getFecha_creacion()
        );

        return ResponseEntity.ok(datosTopico);
    }


//------Borrar Topico----------------


    @DeleteMapping("/{id}")
    @jakarta.transaction.Transactional
    public ResponseEntity eliminarTopico(@PathVariable Long id) {
        var topico = topicoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Tópico no encontrado"));

        topicoRepository.delete(topico);

        return ResponseEntity.noContent().build(); // 204 No Content
    }


    }
