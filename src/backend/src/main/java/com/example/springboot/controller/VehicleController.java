package com.example.springboot.controller;

import com.example.springboot.dto.IdDto;
import com.example.springboot.model.Vehicle;
import com.example.springboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping("/")
    public IdDto registerVehicle() {
        Vehicle registeredVehicle = this.vehicleService.registerVehicle();

        return new IdDto(registeredVehicle.getId());
    }
}
