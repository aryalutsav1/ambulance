package com.aggregator.apiassignment.ambulance.model.dtos;


import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@NoArgsConstructor

@Getter
@Setter
@ToString
public class AmbulancesDto {


    @NotNull(message = "The name of the ambulance provider cannot be null")
    @NotEmpty
    private String name;

    @NotNull(message = "The name of the Hospital that ambulance is associated cannot be null")
    @NotEmpty
    private String affiliatedHospital;

    private Double longitude;

    private Double latitude;

    @NotNull(message = "The name of the district  that ambulance is located cannot be null")
    @NotEmpty
    private String district;

    private boolean isOpen;

     private LocalDateTime createdTime;

    public AmbulancesDto(String name, String affiliatedHospital, Double longitude, Double latitude, String district, boolean isOpen, LocalDateTime createdTime) {
        this.name = name;
        this.affiliatedHospital = affiliatedHospital;
        this.longitude = longitude;
        this.latitude = latitude;
        this.district = district;
        this.isOpen = isOpen;
        this.createdTime = createdTime;
    }

}
