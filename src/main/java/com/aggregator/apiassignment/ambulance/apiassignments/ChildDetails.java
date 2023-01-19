package com.aggregator.apiassignment.ambulance.apiassignments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class ChildDetails {

    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String dobANB;
    private String ANByear;
    private String relation;

}
