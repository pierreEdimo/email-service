package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformation {

    /**
     * Le nom de famille du client
     */
    private String lastName;

    /**
     * La ville ou le client habitte.
     */
    private String city;

    /**
     * Le pays d'habitation du client
     */
    private String country;

    /**
     * L'E-mail du client
     */
    private String email;

    /**
     * Le quartier d'habitation du client
     */
    private String streetName;

    /**
     * La Boite postale du client.
     */
    private String poBox;

    /**
     * Le numero de domicile du client.
     */
    private String houseNumber;

    /**
     * Le prenom du client.
     */
    private String firstName;

    /**
     * Le numero de telephone du client.
     */
    private String phoneNumber;
}
