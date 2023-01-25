package com.aggregator.apiassignment.ambulance.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class AddressOfAmbulance {
    private String city;
    private String district;
    private String State;

}
