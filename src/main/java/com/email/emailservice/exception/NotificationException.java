package com.email.emailservice.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class NotificationException extends Exception {
    @Getter
    private final HttpStatus httpStatus;

    /**
     * Initialise une Exception customisee pour Notification
     *
     * @param message    L'erreur a affiche.
     * @param httpStatus Le status-code de l'erreur.
     */
    public NotificationException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
