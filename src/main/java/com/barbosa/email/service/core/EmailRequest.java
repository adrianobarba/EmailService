package com.barbosa.email.service.core;

public record EmailRequest(String to, String subject, String body) {
}
