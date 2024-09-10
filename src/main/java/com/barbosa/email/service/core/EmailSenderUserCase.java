package com.barbosa.email.service.core;

public interface EmailSenderUserCase {
    void sendEmail(String to, String subject, String body);
}
