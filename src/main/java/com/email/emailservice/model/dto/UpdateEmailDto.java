package com.email.emailservice.model.dto;

import com.email.emailservice.model.UserInformation;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmailDto {
    private String lastName;
    private String firstName;
    private String subject;
    private String to;
    private String body;
    private String sellerEmail;
}
