package com.email.emailservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String status;
    private String payMentMode;
    private int totalQuantity;
    private int totalPrice;
    private List<CartItem> cartItems;
}
