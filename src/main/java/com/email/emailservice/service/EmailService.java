package com.email.emailservice.service;

import com.email.emailservice.model.dto.ConfirmationEmailDto;
import com.email.emailservice.model.dto.OrderEmailDto;
import com.email.emailservice.model.dto.UpdateEmailDto;

public interface EmailService {
    void sendOrderEmail(OrderEmailDto newEmail);

    void sendConfirmationEmail(ConfirmationEmailDto newEmail);

    void sendUpdateEmail(UpdateEmailDto newEmail);
}
