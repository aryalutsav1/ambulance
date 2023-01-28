package com.aggregator.apiassignment.ambulance.controller;


import com.aggregator.apiassignment.ambulance.model.Ambulance;
import com.aggregator.apiassignment.ambulance.model.dtos.AmbulancesDto;
import com.aggregator.apiassignment.ambulance.model.services.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

//import org.springframework.web.bind.annotation.Api;
import javax.validation.Valid;

@RestController
//@Controller(value = "My Custom Controller Name")
//@Controller(name = "My Custom Controller Name")
@RequestMapping(value = "/ambulance")
//@Api(value = "ExampleController", description = "Operations related to example")

public class SimpleAmbulanceController {

    @Autowired
    AmbulanceService ambulanceService;

    @PostMapping(value = "")
    public String ping(){
        return "Ambulance controller class is working fine ";
    }


    @GetMapping(value = "/list")
    public ResponseEntity<Iterable<Ambulance>> ambulanceList(){
        Iterable<Ambulance> ambulanceList = ambulanceService.getAmbulanceList();
        return ResponseEntity.status(HttpStatus.OK).body(ambulanceList);
    }
    @GetMapping(value = "/ambulance/{id}")
    public ResponseEntity<Ambulance> getAmbulanceDetail(@PathVariable(value = "id") Long ambulanceId){
        Ambulance ambulance = ambulanceService.getAmbulanceDetail(ambulanceId);
        return ResponseEntity.status(HttpStatus.OK).body(ambulance);
    }


    @PostMapping(value = "/ambulance")
    public ResponseEntity<Ambulance> createAmbulance(@Valid @RequestBody AmbulancesDto ambulancesDto){
        System.out.println(ambulancesDto);
        Ambulance createdAmbulance =  ambulanceService.createAmbulance(ambulancesDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAmbulance);
    }

    @PutMapping(value = "/ambulance/{id}")
    public ResponseEntity<Ambulance> updateAmbulance(@PathVariable(value = "id") Long ambulanceID,@Valid @RequestBody AmbulancesDto ambulancesDTO){
        Ambulance updatedAmbulance =  ambulanceService.updateAmbulance(ambulanceID,ambulancesDTO);
        return ResponseEntity.status(HttpStatus.OK).body(updatedAmbulance);
    }


    @DeleteMapping(value = "/ambulance/{id}")
    public ResponseEntity<String> deleteAmbulance(@PathVariable(value = "id") Long ambulanceID){
        System.out.println(ambulanceID);
        ambulanceService.deleteAmbulance(ambulanceID);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
