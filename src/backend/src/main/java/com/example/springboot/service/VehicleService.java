package com.example.springboot.service;

import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Vehicle;
import com.example.springboot.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleService(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public Vehicle registerVehicle() {
        return this.vehicleRepository.save(new Vehicle());
    }

    public void updateVehiclePosition(Long vehicleId, float latitude, float longitude) throws VehicleNotFoundException {
        this.vehicleRepository.updatePosition(vehicleId, latitude, longitude);
    }

    public List<Vehicle> getVehiclesWithinRange(float latitude, float longitude, float radius) {
        return this.vehicleRepository.findVehicleInSphere(latitude, longitude, radius);
    }
}
