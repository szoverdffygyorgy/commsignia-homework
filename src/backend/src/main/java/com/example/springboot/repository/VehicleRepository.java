package com.example.springboot.repository;

import com.example.springboot.model.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, String> {
    Vehicle create();
    Vehicle updatePosition(String id, float latitude, float longitude);
    List<Vehicle> findAroundCoordinate(float latitude, float longitude, float radius);
}
