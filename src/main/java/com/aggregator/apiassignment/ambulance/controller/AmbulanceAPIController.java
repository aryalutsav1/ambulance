package com.aggregator.apiassignment.ambulance.controller;

import com.aggregator.apiassignment.ambulance.services.Ambulance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value= "/Test1")
public class AmbulanceAPIController {

    @PostMapping(value = "")
    public Ambulance getAmbulance(){

        Ambulance ambulance=new Ambulance();
        return ambulance;
    }

    @PostMapping(value = "/API/v1/ambulance")
    public String ambulanceTest(){
        return "This means the ambulance mapping is working";
    }

//   @PostMapping(value = "/API/v1/post-ambulance")
//    public String ambulanceTestPost(){
//        return "This means the ambulance mapping is working";
//    }
}
