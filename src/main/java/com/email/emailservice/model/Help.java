package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Help {
    /**
     * Le nom du vendeur
     */
    private String name;

    /**
     * L'Email du vendeur
     */
    private String email;

    /**
     * le numero de telephone du vendeur
     */
    private String phoneNumber;

    /**
     * Le message
     */
    private String message;

    /**
     * Le destinataire
     */
    private String to;

    /**
     * Le Sujet de la lettre
     */
    private String subject;
}
