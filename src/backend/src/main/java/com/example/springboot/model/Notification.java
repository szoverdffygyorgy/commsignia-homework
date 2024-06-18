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
    Long id;

    @JsonProperty(value = "Vehicle")
    @ManyToOne()
    @JoinColumn(name = "vehicle_id")
    Vehicle vehicle;

    @JsonProperty(value = "Message")
    @Column(name = "message", nullable = false)
    String message;

    public Notification(Vehicle vehicle, String message) {
        this.vehicle = vehicle;
        this.message = message;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
