package com.example.springboot.dto;

public class CreateNotificationRequestDto {
    private Long vehicle_id;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getVehicleId() {
        return vehicle_id;
    }

    public void setVehicle_id(Long vehicle_id) {
        this.vehicle_id = vehicle_id;
    }
}
