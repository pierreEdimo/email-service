package com.email.emailservice.controller;

import com.email.emailservice.model.dto.ConfirmationEmailDto;
import com.email.emailservice.model.dto.OrderEmailDto;
import com.email.emailservice.model.dto.UpdateEmailDto;
import com.email.emailservice.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("")
public class emailController {
    private final EmailService service;

    @PostMapping("order")
    public void sendOrderConfirmationEmail(@RequestBody OrderEmailDto newEmail) {
        this.service.sendOrderEmail(newEmail);
    }

    @PostMapping("confirmation")
    public void SendConfirmationEmail(@RequestBody ConfirmationEmailDto newEmail) {
        this.service.sendConfirmationEmail(newEmail);
    }

    @PostMapping("update")
    public void sendUpdateEmail(@RequestBody UpdateEmailDto newEmail) {
        this.service.sendUpdateEmail(newEmail);
    }
}
