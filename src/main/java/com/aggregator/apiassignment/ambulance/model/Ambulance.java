package com.aggregator.apiassignment.ambulance.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter

@Table
@Entity(name = "ambulance_tbl")
public class Ambulance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Setter
    @Column(name = "name")
    private String name;
    @Setter
    @Column(name = "affiliated_hospital")
    private String affiliatedHospital;
    @Setter
    @Column(name = "longitude")
    private Double longitude;
    @Setter
    @Column(name = "latitude")
    private Double latitude;

    @Setter
    @Column(name = "district")
    private String district;
    @Setter
    @Column(name = "is_open")
    private boolean isOpen;
    @Setter
    @Column(name = "created_time")

    private LocalDateTime createdTime;

    public Ambulance(String name, String affiliatedHospital, Double longitude, Double latitude, String district, boolean isOpen, LocalDateTime createdTime) {
        this.name = name;
        this.affiliatedHospital = affiliatedHospital;
        this.longitude = longitude;
        this.latitude = latitude;
        this.district = district;
        this.isOpen = isOpen;
        this.createdTime = createdTime;
    }
}
