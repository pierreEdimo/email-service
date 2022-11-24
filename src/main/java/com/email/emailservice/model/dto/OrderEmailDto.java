package com.email.emailservice.model.dto;

import com.email.emailservice.model.Order;
import com.email.emailservice.model.UserInformation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEmailDto {
    /**
     * Les Informations du client,
     */
    private UserInformation userInformation;

    /**
     * Le sujet du message
     */
    private String subject;

    /**
     * Le destinataire de l'E-Mail
     */
    private String to;

    /**
     * Les informations sur la commande
     */
    private Order order;
}
