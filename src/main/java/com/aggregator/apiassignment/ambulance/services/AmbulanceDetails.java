package com.aggregator.apiassignment.ambulance.services;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class AmbulanceDetails {
    private String category;
    private boolean isSmart;
    private boolean hasOxygenCylinder;
    private double ratePerMile;
    private double serviceCharge;
}
