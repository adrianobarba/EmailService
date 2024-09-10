package com.barbosa.email.service.core;

public class EmailServiceException extends RuntimeException {
    public EmailServiceException(String message){
        super(message);
    }

    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }
}
