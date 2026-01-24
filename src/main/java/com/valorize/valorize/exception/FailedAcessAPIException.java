package com.valorize.valorize.exception;

public class FailedAcessAPIException extends RuntimeException {
    public FailedAcessAPIException(String message) {
        super(message);
    }

    public FailedAcessAPIException() {
        super("Erro ao acessar api externa");
    }
}
