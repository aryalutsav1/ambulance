package com.aggregator.apiassignment.ambulance.model.dtos;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class ContactDetailsDto {
    private List<String> email = null;
    private List<String> phoneNumber = null;
    private List<String> faxNumber = null;
    private String websiteLink;

}
