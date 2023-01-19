package com.aggregator.apiassignment.ambulance.apiassignments;

import jdk.jshell.Snippet;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping(value="/Test2")
public class AssignmentAPIController {

    @PostMapping(value = "/API/Test")
    public UiModel insuranceAPITest(){
        List<String> products = List.of("EducationProtectionPlan", "LifeCare");

        NonForfeiture APL = new NonForfeiture("APL",true,false,"Automatic Premium Loan");
        NonForfeiture ADL = new NonForfeiture("ADL",true,false,"Accidental Death Benefit");
        NonForfeiture PU = new NonForfeiture("PU",true,false,"Paid Up");
        List <NonForfeiture > nonForfeiture = List.of(APL,ADL,PU);

        Riders EPR = new Riders("EPR",false,null,"","","","5000","Education Protection Rider","EPR",false,false);
        Riders DPR = new Riders("EPR",false,null,"","","","5000","Education Protection Rider","EPR",false,false);
        Riders PA = new Riders("EPR",false,null,"","","","5000","Education Protection Rider","EPR",false,false);
        List<Riders> riders =List.of(EPR,DPR,PA);

        ChildDetails child1 = new ChildDetails("Aarav","TestAryal","Male","03/06/1997","",null,"");
        ChildDetails child2 = new ChildDetails("Test","TestAryal","Male","03/06/1997","",null,"");
        List<ChildDetails> childDetails = List.of(child1,child2);

        BasicPlanDetails basicPlanDetails = new BasicPlanDetails("Education Protection Plan (EPP)","5000000", "14 Years","Gold","Annual","41,325","41,325","","41,325");

//        basicPlanDetails.forEach(x->x=null);
        return new UiModel(
                "Ready",
                "Output String ",
                "outputforComparision ",
                "EducationProtectionPlan",
                "planCode=EducationProtectionPlan",
                "PdfPath Test",
                "Type Test",
                childDetails,
                basicPlanDetails,
                riders,
                nonForfeiture,
                true,
                products);
    }
}
