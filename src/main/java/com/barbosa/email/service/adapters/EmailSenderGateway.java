package com.barbosa.email.service.adapters;

public interface EmailSenderGateway {

    void sendEmail(String to, String subject, String body);
}
