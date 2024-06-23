package com.example.springboot.dto;

import com.example.springboot.model.Notification;

import java.time.Instant;

public class NotificationDto {
    private final Long id;
    private final Long vehicleId;
    private final String message;
    private final Instant createdAt;

    public NotificationDto(Notification notification) {
        this.id = notification.getId();
        this.vehicleId = notification.getVehicleId();
        this.message = notification.getMessage();
        this.createdAt = notification.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public String getMessage() {
        return message;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
