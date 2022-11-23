package com.email.emailservice.service;

import com.email.emailservice.model.dto.OrderEmailDto;

public interface EmailService {
    void sendOrderEmail(OrderEmailDto newEmail);
}
