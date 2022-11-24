package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    /**
     * Le Status de la commande.
     */
    private String status;

    /**
     * Le mode de paiement de la commande.
     */
    private String payMentMode;

    /**
     * La quantite totale des produits commandes.
     */
    private int totalQuantity;

    /**
     * le prix total des produits commandes.
     */
    private int totalPrice;

    /**
     * La liste des produits commandes.
     */
    private List<CartItem> cartItems;
}
