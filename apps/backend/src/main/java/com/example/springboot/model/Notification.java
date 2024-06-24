package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.Instant;

@Entity()
@Table(name = "notification")
public class Notification {
    @Id
    @JsonProperty(value = "id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty(value = "vehicleId")
    @Column(name = "vehicle_id", nullable = false)
    private Long vehicleId;

    @JsonProperty(value = "message")
    @Column(name = "message", nullable = false)
    private String message;

    @JsonProperty(value = "createdAt")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    public Notification() {}

    public Notification(Long vehicleId, String message) {
        this.vehicleId = vehicleId;
        this.message = message;
        this.createdAt = Instant.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
