package com.example.springboot.dto;

import com.example.springboot.model.Vehicle;

import java.util.List;

public record GetVehiclesWithinRangeDto(List<Vehicle> vehicles) {
}
