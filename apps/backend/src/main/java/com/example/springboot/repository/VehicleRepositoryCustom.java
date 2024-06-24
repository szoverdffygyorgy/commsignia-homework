package com.example.springboot.repository;

import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Vehicle;


public interface VehicleRepositoryCustom  {
    void updatePosition(Vehicle vehicle, float latitude, float longitude) throws VehicleNotFoundException;
    }
