package com.aggregator.apiassignment.ambulance.model.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class AmbulanceDetailsDto {
    private String category;
    private boolean isSmartAmbulance;
    private boolean hasOxygenCylinder;
    private double ratePerMile;
    private double serviceCharge;

}
