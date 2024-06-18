package com.example.springboot.repository;

import com.example.springboot.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    // Vehicle updatePosition(Integer id, float latitude, float longitude);
    // List<Vehicle> findAroundCoordinate(float latitude, float longitude, float radius);
}
