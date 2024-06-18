package com.example.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @JsonProperty(value = "Id")
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @JsonProperty(value = "Latitude")
    @Column(name = "latitude", nullable = false )
    float latitude;

    @JsonProperty(value = "Longitude")
    @Column(name = "longitude", nullable = false )
    float longitude;

    @JsonProperty(value = "Notifications")
    @OneToMany(mappedBy = "vehicle")
    List<Notification> notifications;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public float getLatitude() { return latitude; }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLongitude() {
        return longitude;
    }
}
