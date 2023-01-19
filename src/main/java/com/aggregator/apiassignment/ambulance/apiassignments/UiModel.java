package com.aggregator.apiassignment.ambulance.apiassignments;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
//@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class UiModel {
    private String status;
    private String output;
    private String outputforComparision;
    private String category;
    private String plancode;
    private String pdfPath;
    private String type;
    private List<ChildDetails> childDetails;
    private BasicPlanDetails basicPlanDetails;
    private List<Riders> riders;
    private  List <NonForfeiture> nonForfeiturelist;
    private boolean isPayorDetailMandatory;
    private List<String> selectedProduct;


}
