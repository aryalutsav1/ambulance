package com.aggregator.apiassignment.ambulance.services;

import lombok.*;
import org.apache.tomcat.jni.Address;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Ambulance {

    private String name;
    private String affiliatedHospital;
    private Double longitude;
    private Double latitude;
    private AddressOfAmbulance address = null;
    private boolean isOpen;
    private AmbulanceDetails ambulanceDetails = null;
    private ContactDetails contactDetails = null;


}
