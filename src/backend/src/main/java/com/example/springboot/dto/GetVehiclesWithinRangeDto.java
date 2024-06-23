package com.example.springboot.dto;

import java.util.List;

public record GetVehiclesWithinRangeDto(List<VehicleListItemDto> vehicles) {
}
