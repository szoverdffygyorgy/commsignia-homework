package com.example.springboot.exceptions;

public class GetVehiclesQueryParamException extends Exception {
    @Override
    public String getMessage() {
        return "Either all query params (latitude, longitude, radius) must be provided or no query params at all.";
    }
}
