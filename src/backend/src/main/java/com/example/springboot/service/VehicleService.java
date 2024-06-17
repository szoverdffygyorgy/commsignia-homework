package com.example.springboot.service;

import com.example.springboot.model.Vehicle;
import com.example.springboot.repository.VehicleRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private final VehicleRepositoryImpl vehicleRepository;

    @Autowired
    public VehicleService(final VehicleRepositoryImpl vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle registerVehicle() {
        return this.vehicleRepository.create();
    }
}
