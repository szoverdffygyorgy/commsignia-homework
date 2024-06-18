package com.example.springboot.controller;

import com.example.springboot.dto.CreateNotificationRequestDto;
import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public void createNotification(@RequestBody CreateNotificationRequestDto notification) throws VehicleNotFoundException {
        this.notificationService.createNotification(notification);
    }
}
