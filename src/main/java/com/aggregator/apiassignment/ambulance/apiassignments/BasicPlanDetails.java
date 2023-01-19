package com.aggregator.apiassignment.ambulance.apiassignments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class BasicPlanDetails {


    private String planName;
    private String sumAssured;
    private String term;
    private String plan;
    private String paymentFrequency;
    private String modalPremium;
    private String annualPremium;
    private String accidentalPremium;
    private String totalPremium;

   }
