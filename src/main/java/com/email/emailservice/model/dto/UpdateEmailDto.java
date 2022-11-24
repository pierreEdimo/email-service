package com.email.emailservice.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmailDto {
    /**
     * Le nom de famille du client
     */
    private String lastName;

    /**
     * Le prenom du client.
     */
    private String firstName;

    /**
     * Le sujet du message
     */
    private String subject;

    /**
     * Le destinataire de l'E-Mail
     */
    private String to;

    /**
     * Le corps du message
     */
    private String body;

    /**
     * L'adresse E-mail du vendeur
     */
    private String sellerEmail;
}
