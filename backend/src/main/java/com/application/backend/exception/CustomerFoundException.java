package com.application.backend.exception;

public class CustomerFoundException extends RuntimeException {
    
    public CustomerFoundException(String message) {
        super(message);
    }

    public CustomerFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
