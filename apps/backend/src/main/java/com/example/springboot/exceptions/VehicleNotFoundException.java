package com.example.springboot.exceptions;

public class VehicleNotFoundException extends Exception {
    private final Long vehicleId;

    public VehicleNotFoundException(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    @Override
    public String getMessage() {
        return "Vehicle with id: " + vehicleId + " not found";
    }
}
