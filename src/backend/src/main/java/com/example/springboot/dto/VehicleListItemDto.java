package com.example.springboot.dto;

import com.example.springboot.model.Vehicle;

import java.time.Instant;

public class VehicleDto {
    private final Long id;
    private final float latitude;
    private final float longitude;
    private final Instant createdAt;

    public VehicleDto(Vehicle vehicle) {
        this.id = vehicle.getId();
        this.latitude = vehicle.getLatitude();
        this.longitude = vehicle.getLongitude();
        this.createdAt = vehicle.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
