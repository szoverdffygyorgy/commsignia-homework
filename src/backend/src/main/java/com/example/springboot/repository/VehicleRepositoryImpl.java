package com.example.springboot.repository;

import com.example.springboot.model.Vehicle;

import java.util.List;
import java.util.Optional;

public class VehicleRepositoryImpl implements VehicleRepository {
    @Override
    public Vehicle create() {
        Vehicle newVehicle = new Vehicle();

        this.save(newVehicle);

        return newVehicle;
    }

    @Override
    public Vehicle updatePosition(String id, float latitude, float longitude) {
        return null;
    }

    @Override
    public List<Vehicle> findAroundCoordinate(float latitude, float longitude, float radius) {
        return List.of();
    }

    @Override
    public <S extends Vehicle> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Vehicle> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Vehicle> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<Vehicle> findAll() {
        return null;
    }

    @Override
    public Iterable<Vehicle> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(Vehicle entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends Vehicle> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
