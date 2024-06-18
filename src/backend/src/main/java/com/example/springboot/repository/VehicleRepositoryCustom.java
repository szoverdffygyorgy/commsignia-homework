package com.example.springboot.repository;

import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Vehicle;

import java.util.List;

public interface VehicleRepositoryCustom  {
    void updatePosition(Long id, float latitude, float longitude) throws VehicleNotFoundException;
    List<Vehicle> findVehicleInSphere(float latitude, float longitude, float radius);
}
