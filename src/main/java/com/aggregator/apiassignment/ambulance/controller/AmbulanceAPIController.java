package com.aggregator.apiassignment.ambulance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value= "/Test1")
public class AmbulanceAPIController {

    @PostMapping(value = "")
    public String ping(){
        return "This is a ping test and it's working";
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
