package com.aggregator.apiassignment.ambulance.model;

import lombok.*;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class ContactDetails {
    private List<String> email = null;
    private List<String> phoneNumber = null;
    private List<String> faxNumber = null;
    private String websiteLink;

}
