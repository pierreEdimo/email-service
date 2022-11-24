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
    private UserInformation userInformation;
    private Order order;
    private String to;
    private String subject;
    private String sellerEmail;
}
