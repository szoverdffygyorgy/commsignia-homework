package com.example.springboot.dto;

import com.example.springboot.model.Vehicle;

import java.time.Instant;

public class VehicleListItemDto extends VehicleDto {
    private final int numOfNotifications;

    public VehicleListItemDto(Vehicle vehicle) {
        super(vehicle);

        this.numOfNotifications = vehicle.getNotifications().size();
    }

    public int getNumOfNotifications() {
        return numOfNotifications;
    }
}
