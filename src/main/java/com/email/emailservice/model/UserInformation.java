package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformation {
    private String lastName;
    private String city;
    private String country;
    private String email;
    private String streetName;
    private String poBox;
    private String houseNumber;
    private String firstName;
    private String phoneNumber;
}
