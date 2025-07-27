package com.aluracursos.challenge_foro_hub.infra;

public class ValidacionException extends RuntimeException{

    public ValidacionException(String mensaje) {
        super(mensaje);
    }
}
