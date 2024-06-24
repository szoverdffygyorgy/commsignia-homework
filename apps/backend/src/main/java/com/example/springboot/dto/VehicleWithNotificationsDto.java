package com.example.springboot.dto;

import com.example.springboot.model.Vehicle;

import java.util.List;

public class VehicleWithNotificationsDto extends VehicleDto {
    private final List<NotificationDto> notifications;

    public VehicleWithNotificationsDto(Vehicle vehicle) {
        super(vehicle);

        this.notifications = vehicle.getNotifications().stream().map(NotificationDto::new).toList();
    }

    public List<NotificationDto> getNotifications() {
        return notifications;
    }
}
