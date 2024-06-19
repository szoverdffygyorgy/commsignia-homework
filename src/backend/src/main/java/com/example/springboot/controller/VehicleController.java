package com.example.springboot.controller;

import com.example.springboot.dto.GetVehiclesWithinRangeDto;
import com.example.springboot.dto.RegisterVehicleResponseDto;
import com.example.springboot.dto.UpdateVehiclePositionDto;
import com.example.springboot.exceptions.GetVehiclesQueryParamException;
import com.example.springboot.exceptions.VehicleNotFoundException;
import com.example.springboot.model.Vehicle;
import com.example.springboot.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Optional;

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
    public GetVehiclesWithinRangeDto getVehiclesWithinRange(@RequestParam(required = false) Optional<Float> latitude, @RequestParam(required = false) Optional<Float> longitude, @RequestParam(required = false) Optional<Float> radius) {
        try {
            ArrayList<Optional<Float>> queryParams = new ArrayList<>() {{
                add(latitude);
                add(longitude);
                add(radius);
            }};

            int numOfQueryParams = queryParams.stream().filter(Optional::isPresent).toList().size();

            if (numOfQueryParams < 3 && numOfQueryParams != 0) {
                throw new GetVehiclesQueryParamException();
            }

            if (numOfQueryParams == 0) {
                return new GetVehiclesWithinRangeDto(this.vehicleService.getVehicles());
            }

            return new GetVehiclesWithinRangeDto(this.vehicleService.getVehiclesWithinRange(latitude.get(), longitude.get(), radius.get()));
        } catch (GetVehiclesQueryParamException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage(), e);
        }
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
