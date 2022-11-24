package com.email.emailservice.model.dto;

import com.email.emailservice.model.Order;
import com.email.emailservice.model.UserInformation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfirmationEmailDto {
    /**
     * Les Informations du client,
     */
    private UserInformation userInformation;

    /**
     * Les informations sur la commande
     */
    private Order order;

    /**
     * Le destinataire de l'E-Mail
     */
    private String to;

    /**
     * Le sujet du message
     */
    private String subject;

    /**
     * L'adresse E-Mail du commercant.
     */
    private String sellerEmail;
}
