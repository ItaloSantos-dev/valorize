package com.valorize.valorize.exception;

public class CoinInvalidException extends RuntimeException{
    public CoinInvalidException() {
        super("Moeda inválida");
    }

    public CoinInvalidException(String message) {
        super(message);
    }
}
