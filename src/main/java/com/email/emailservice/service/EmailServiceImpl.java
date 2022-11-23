package com.email.emailservice.service;

import com.email.emailservice.exception.NotificationException;
import com.email.emailservice.feign.NotificationFeignClient;
import com.email.emailservice.model.OrderNotificationModel;
import com.email.emailservice.model.dto.OrderEmailDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class EmailServiceImpl implements EmailService {

    private final Configuration configuration;

    private final NotificationFeignClient feignClient;

    @Override
    public void sendOrderEmail(OrderEmailDto newEmail) {
        try {
            Template template = configuration.getTemplate("order.template.ftl");
            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, newEmail);

            OrderNotificationModel model = new OrderNotificationModel(
                    newEmail.getSubject(),
                    newEmail.getTo(),
                    html
            );

            String response = this.feignClient.sendEmailNotification(model);
            System.out.println(response);


        } catch (IOException | TemplateException | NotificationException e) {
            throw new RuntimeException(e);
        }
    }
}

