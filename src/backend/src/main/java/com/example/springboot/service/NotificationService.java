package com.example.springboot.service;

import com.example.springboot.dto.CreateNotificationRequestDto;
import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Notification;
import com.example.springboot.model.Vehicle;
import com.example.springboot.repository.NotificationRepository;
import com.example.springboot.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {
    private final NotificationRepository notificationRepository;
    private final VehicleRepository vehicleRepository;

    @Autowired
    public NotificationService(NotificationRepository notificationRepository, VehicleRepository vehicleRepository) {
        this.notificationRepository = notificationRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public void createNotification(CreateNotificationRequestDto notification) throws VehicleNotFoundException {
        Optional<Vehicle> vehicle = vehicleRepository.findById(notification.vehicle_id);

        if (vehicle.isEmpty()) {
            throw new VehicleNotFoundException();
        }

        this.notificationRepository.save(new Notification(vehicle.get(), notification.getMessage()));
    }

}
