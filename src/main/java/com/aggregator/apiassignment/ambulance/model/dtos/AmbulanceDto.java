package com.aggregator.apiassignment.ambulance.model.dtos;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode

public class AmbulanceDto {

    private String name;
    private String affiliatedHospital;
    private Double longitude;
    @NonNull
    private Double latitude;
    @NonNull
    private AddressOfAmbulanceDto address = null;
    private boolean isAllHourService;
    private boolean isOpen;
    private AmbulanceDetailsDto ambulanceDetails = null;
    private ContactDetailsDto contactDetails = null;


}
