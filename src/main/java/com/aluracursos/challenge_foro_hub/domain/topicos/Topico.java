package com.aluracursos.challenge_foro_hub.domain.topicos;

import com.aluracursos.challenge_foro_hub.domain.usuarios.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String mensaje;
    private String nombre_curso;
    private LocalDateTime fecha_creacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Topico(String titulo, String mensaje, String nombre_curso, Usuario usuario,LocalDateTime fecha_creacion) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.nombre_curso = nombre_curso;
        this.usuario = usuario;
        this.fecha_creacion= fecha_creacion;
    }


//--------------------


    public void actualizarDatos(DatosActualizarTopico datos) {
        if (datos.titulo() != null) {
            this.titulo = datos.titulo();
        }
        if (datos.mensaje() != null) {
            this.mensaje = datos.mensaje();
        }
        if (datos.nombre_curso() != null) {
            this.nombre_curso = datos.nombre_curso();
        }
        if (datos.fecha_creacion() != null) {
            this.fecha_creacion = datos.fecha_creacion();
        }
    }

  /*  public void actualizarDatos(DatosActualizarTopico datosActualizarTopico)
          if (datosActualizarTopico.mensaje() != null) {
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.fecha_creacion() != null) {
            this.fecha_creacion = datosActualizarTopico.fecha_creacion();
        }
        if (datosActualizarTopico.nombre_curso() != null) {
            this.nombre_curso = datosActualizarTopico.nombre_curso();
        }
    }*/



}