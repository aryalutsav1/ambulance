package com.aggregator.apiassignment.ambulance.model.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class AddressOfAmbulanceDto {
    private String city;
    private String district;
    private String State;

}
