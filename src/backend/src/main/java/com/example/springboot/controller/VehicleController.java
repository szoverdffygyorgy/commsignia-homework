package com.example.springboot.controller;

import com.example.springboot.dto.GetVehiclesWithinRangeDto;
import com.example.springboot.dto.RegisterVehicleResponseDto;
import com.example.springboot.dto.UpdateVehiclePositionDto;
import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Vehicle;
import com.example.springboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(final VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    @ResponseBody
    public GetVehiclesWithinRangeDto getVehiclesWithinRange(@RequestParam float latitude, @RequestParam float longitude, @RequestParam float radius) {
        return new GetVehiclesWithinRangeDto(this.vehicleService.getVehiclesWithinRange(latitude, longitude, radius));
    }

    @PostMapping
    @ResponseBody
    public RegisterVehicleResponseDto registerVehicle() {
        Vehicle registeredVehicle = this.vehicleService.registerVehicle();

        return new RegisterVehicleResponseDto(registeredVehicle.getId());
    }

    @PostMapping("/{vehicleId}")
    public void updateVehiclePosition(@RequestBody UpdateVehiclePositionDto position, @PathVariable Long vehicleId) {
        try {
            this.vehicleService.updateVehiclePosition(vehicleId, position.getLatitude(), position.getLongitude());
        } catch (VehicleNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
        }
    }
}
