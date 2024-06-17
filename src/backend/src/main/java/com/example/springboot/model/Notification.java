package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity()
@Table(name = "notification")
public class Notification {
    @Id
    @JsonProperty(value = "Id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @JsonProperty(value = "Vehicle")
    @ManyToOne()
    @JoinColumn(name = "vehicle_id")
    Vehicle vehicle;

    @JsonProperty(value = "Message")
    @Column(name = "message", nullable = false)
    String message;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
