package com.email.emailservice.service;

import com.email.emailservice.exception.NotificationException;
import com.email.emailservice.feign.NotificationFeignClient;
import com.email.emailservice.model.Help;
import com.email.emailservice.model.NotificationModel;
import com.email.emailservice.model.dto.ConfirmationEmailDto;
import com.email.emailservice.model.dto.OrderEmailDto;
import com.email.emailservice.model.dto.UpdateEmailDto;
import freemarker.template.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final Configuration configuration;

    private final NotificationFeignClient feignClient;

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     */
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

    /**
     * {@inheritDoc}
     * @param newEmail Les informations qui sont ecrites dans l'E-mail
     */
    @Override
    public void sendHelpEmail(Help newEmail) {
        try {
            Template template = configuration.getTemplate("templates/help.template.ftl");
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, newEmail);
            this.confirmSend(newEmail.getSubject(), newEmail.getTo(), html);
        } catch (IOException | TemplateException | NotificationException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }
    }

    /**
     * Confirme l'envoie de l'E-mail.
     *
     * @param subject Le sujet du Message.
     * @param to      La personne qui recoit le message.
     * @param html    Le corps du message.
     * @throws NotificationException En cas d'erreur.
     */
    private void confirmSend(String subject, String to, String html) throws NotificationException {
        NotificationModel model = new NotificationModel(
                subject,
                to,
                html
        );

        this.feignClient.sendEmailNotification(model);
    }
}

