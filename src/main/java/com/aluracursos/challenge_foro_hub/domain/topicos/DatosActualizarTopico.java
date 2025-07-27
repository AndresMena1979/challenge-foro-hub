package com.aluracursos.challenge_foro_hub.domain.topicos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosActualizarTopico(
        @NotNull Long id,
        String mensaje,
        String nombre_curso,
        String titulo,
        LocalDateTime fecha_creacion) {
}
