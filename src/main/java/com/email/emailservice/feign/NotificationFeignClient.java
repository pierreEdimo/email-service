package com.email.emailservice.feign;


import com.email.emailservice.exception.NotificationException;
import com.email.emailservice.model.NotificationModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://notification-service:8004/api/", name = "notifications")
public interface NotificationFeignClient {
    /**
     * Envoiw unw notification par E-mail.
     *
     * @param model Les Information necessaires pour que le message soit delivre
     * @return Ok. Le message a ete envoye avec succes,
     * @throws NotificationException En cas d'erreur.
     */
    @PostMapping("/Email")
    String sendEmailNotification(@RequestBody NotificationModel model) throws NotificationException;
}
