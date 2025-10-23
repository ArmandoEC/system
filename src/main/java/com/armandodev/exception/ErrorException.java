package com.armandodev.exception;

public class ErrorException extends Exception {

    public ErrorException(String message) {
        super(message);
    }

    public ErrorException(String string, Exception e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
