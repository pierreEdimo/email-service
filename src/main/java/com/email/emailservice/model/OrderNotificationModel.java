package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderNotificationModel {
    private String subject;
    private String to;
    private String htmlBody;
}
