package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    /**
     * Le Sku du produit,
     */
    private String productSku;

    /**
     * Le prix par unite du produit.
     */
    private int price;

    /**
     * Le nom du produit.
     */
    private String product;

    /**
     * L'url de l'image du produit.
     */
    private String imageUrl;

    /**
     * La quantite de produits commandes.
     */
    private int quantity;
}
