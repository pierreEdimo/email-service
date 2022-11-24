package com.email.emailservice.service;

import com.email.emailservice.exception.NotificationException;
import com.email.emailservice.feign.NotificationFeignClient;
import com.email.emailservice.model.NotificationModel;
import com.email.emailservice.model.dto.ConfirmationEmailDto;
import com.email.emailservice.model.dto.OrderEmailDto;
import com.email.emailservice.model.dto.UpdateEmailDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final Configuration configuration;

    private final NotificationFeignClient feignClient;

    @Override
    public void sendOrderEmail(OrderEmailDto newEmail) {
        try {
            Template template = configuration.getTemplate("templates/order.template.ftl");
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, newEmail);
            this.confirmSend(newEmail.getSubject(), newEmail.getTo(), html);
        } catch (IOException | TemplateException | NotificationException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void sendConfirmationEmail(ConfirmationEmailDto newEmail) {
        try {
            Template template = configuration.getTemplate("templates/confirmation.template.ftl");
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, newEmail);
            this.confirmSend(newEmail.getSubject(), newEmail.getTo(), html);

        } catch (IOException | TemplateException | NotificationException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @Override
    public void sendUpdateEmail(UpdateEmailDto newEmail) {
        try {
            Template template = configuration.getTemplate("templates/update.template.ftl");
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, newEmail);
            this.confirmSend(newEmail.getSubject(), newEmail.getTo(), html);
        } catch (IOException | TemplateException | NotificationException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    private void confirmSend(String subject, String to, String html) throws NotificationException {
        NotificationModel model = new NotificationModel(
                subject,
                to,
                html
        );

        this.feignClient.sendEmailNotification(model);
    }
}

