package com.email.emailservice.feign;


import com.email.emailservice.exception.NotificationException;
import com.email.emailservice.model.OrderNotificationModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(url = "http://localhost:8004/api/", name = "notifications")
public interface NotificationFeignClient {
    @PostMapping("/Email")
    String sendEmailNotification(@RequestBody OrderNotificationModel model) throws NotificationException;
}
