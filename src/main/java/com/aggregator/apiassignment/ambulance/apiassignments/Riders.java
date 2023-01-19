package com.aggregator.apiassignment.ambulance.apiassignments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Riders {

    private String key;
    private boolean selected ;
    private String term;
    private String premium;
    private String sumAssured;
    private String name;
    private String typeCode;
    private String identifier;
    private String partyRoleIdentifier;
    private boolean isRiderDisabled ;
    private boolean disabled ;


}
