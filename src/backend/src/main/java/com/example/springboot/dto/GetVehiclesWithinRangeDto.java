package com.example.springboot.dto;

import com.example.springboot.model.Vehicle;

import java.util.List;

public class GetVehiclesWithinRangeDto {
    private final List<Vehicle> vehicles;

    public GetVehiclesWithinRangeDto(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }
}
