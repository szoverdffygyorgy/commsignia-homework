package com.example.springboot.repository;

import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Vehicle;
import com.example.springboot.util.GeoDistanceCalculator;
import com.example.springboot.util.Point;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VehicleRepositoryImpl implements VehicleRepositoryCustom {
    private final VehicleRepository vehicleRepository;

    @Autowired
    @Lazy
    public VehicleRepositoryImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public void updatePosition(Long id, float latitude, float longitude) throws VehicleNotFoundException {
        Optional<Vehicle> vehicleToUpdate = vehicleRepository.findById(id);

        if (vehicleToUpdate.isEmpty()) {
            throw new VehicleNotFoundException(id);
        }

        Vehicle vehicle = vehicleToUpdate.get();
        vehicle.setLatitude(latitude);
        vehicle.setLongitude(longitude);

        vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> findVehicleInSphere(float latitude, float longitude, float radius) {
        return vehicleRepository.findAll().stream().filter(vehicle -> {
            Point vehicleLocation = new Point(vehicle.getLatitude(), vehicle.getLongitude());
            Point referencePoint = new Point(latitude, longitude);

            return GeoDistanceCalculator.calculateDistanceOfPoints(referencePoint, vehicleLocation) <= radius;
        }).toList();
    }
}
