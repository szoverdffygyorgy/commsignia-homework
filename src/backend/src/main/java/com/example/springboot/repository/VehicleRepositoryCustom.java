package com.example.springboot.repository;

import com.example.springboot.exceptions.VehicleNotFoundException;

public interface VehicleRepositoryCustom  {
    void updatePosition(Long id, float latitude, float longitude) throws VehicleNotFoundException;
    // List<Vehicle> findAroundCoordinate(float latitude, float longitude, float radius);
}
