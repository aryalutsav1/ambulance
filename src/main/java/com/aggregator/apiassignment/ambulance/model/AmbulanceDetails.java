package com.aggregator.apiassignment.ambulance.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class AmbulanceDetails {
    private String category;
    private boolean isSmartAmbulance;
    private boolean hasOxygenCylinder;
    private double ratePerMile;
    private double serviceCharge;

}
