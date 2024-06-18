package com.example.springboot.controller;

import com.example.springboot.dto.CreateNotificationRequestDto;
import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
        try {
            this.notificationService.createNotification(notification);
        } catch (VehicleNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
        }
    }
}
