package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @JsonProperty(value = "id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty(value = "latitude")
    @Column(name = "latitude", nullable = false )
    private float latitude;

    @JsonProperty(value = "longitude")
    @Column(name = "longitude", nullable = false )
    private float longitude;

    @JsonProperty(value = "notifications")
    @OneToMany(mappedBy = "vehicleId")
    private List<Notification> notifications;

    @JsonProperty(value = "createdAt")
    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    public Vehicle() {
        this.createdAt = Instant.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
