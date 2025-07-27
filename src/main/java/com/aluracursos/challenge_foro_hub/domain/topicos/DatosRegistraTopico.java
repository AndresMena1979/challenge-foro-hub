package com.aluracursos.challenge_foro_hub.domain.topicos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistraTopico(
        @NotNull Long usuario_id,
        @NotNull String mensaje,
        @NotNull String nombre_curso,
        @NotNull String titulo,                 //Título del error
        @NotNull LocalDateTime fecha_creacion

) {
}
