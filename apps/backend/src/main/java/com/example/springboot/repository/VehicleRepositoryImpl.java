package com.example.springboot.repository;

import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Vehicle;
import com.example.springboot.util.GeoDistanceCalculator;
import com.example.springboot.util.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleRepositoryImpl implements VehicleRepositoryCustom {
    private final VehicleRepository vehicleRepository;

    @Autowired
    @Lazy
    public VehicleRepositoryImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void updatePosition(Vehicle vehicle, float latitude, float longitude) {
        vehicle.setLatitude(latitude);
        vehicle.setLongitude(longitude);

        vehicleRepository.save(vehicle);
    }
}
