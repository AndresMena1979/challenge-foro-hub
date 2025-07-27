package com.aluracursos.challenge_foro_hub.domain.topicos;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id,
                                   String mensaje,
                                   String nombre_curso,
                                   String titulo,
                                   LocalDateTime fecha_creacion) {

}
