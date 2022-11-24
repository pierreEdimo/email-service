package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationModel {
    /**
     * Le sujet de la Notification
     */
    private String subject;

    /**
     * La personne qui recoit la Notification
     */
    private String to;

    /**
     * Le corps du message
     */
    private String htmlBody;
}
