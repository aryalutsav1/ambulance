//package com.aggregator.apiassignment.ambulance.controller;
//
//import com.aggregator.apiassignment.ambulance.model.dtos.AmbulanceDto;
//import com.aggregator.apiassignment.ambulance.model.AddressOfAmbulance;
//import com.aggregator.apiassignment.ambulance.model.Ambulance;
//import com.aggregator.apiassignment.ambulance.model.AmbulanceDetails;
//import com.aggregator.apiassignment.ambulance.model.ContactDetails;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.UUID;
//
//@RestController
//@RequestMapping( value= "/Ambulance/list")
//public class AmbulanceAPIController {
//
//    @PostMapping(value = "")
//    public ResponseEntity<List<Ambulance>> getAmbulanceList(){
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(AmbulanceList);
//    }
//
//    @PostMapping(value = "/kathmandu")
////    @ResponseStatus(value = HttpStatus.CREATED)
//    public ResponseEntity< List<Ambulance> >ambulanceInKathmandu(){
//        List<Ambulance> filteredList = new ArrayList<>();
//        String comparingStringValue ="Kathmandu";
//        for (Ambulance ambulance : AmbulanceList) {
//            if (ambulance.getAddress().getDistrict().equals(comparingStringValue)) {
//                filteredList.add(ambulance);
//            }
//        }
//
//        return ResponseEntity.status(HttpStatus.CREATED).body(filteredList);
//    }
//
//    @PostMapping(value = "/kathmandu/body")
//    @ResponseStatus(value = HttpStatus.CREATED)
//    public ResponseEntity< List<AmbulanceDto> >ambulanceInKathmandu(@Valid @RequestBody List<AmbulanceDto> ambulanceDtoList){
//
////        List<> filteredList = new ArrayList<>();
////        filteredList.add(ambulanceDto);
//
//        for (AmbulanceDto ambulancedto:ambulanceDtoList
//             ) {
//            System.out.println(ambulancedto);
//        }
//        System.out.println("The end of DTO");
//        return ResponseEntity.status(HttpStatus.CREATED).body(ambulanceDtoList);
//
//    }
////
//////    @PostMapping(value = "/Lalitpur/body")
//////    @ResponseStatus(value = HttpStatus.CREATED)
////    @PostMapping(value = "/Lalitpur/body")
////    public ResponseEntity< <AmbulanceDto> ResponseEntity<AmbulanceDto> ambulanceInLalitput(@Valid @RequestBody AmbulanceDto ambulanceDto){
////
//////        List<> filteredList = new ArrayList<>();
//////        filteredList.add(ambulanceDto);
////
////
////        System.out.println("The end of DTO");
////        return ResponseEntity.status(HttpStatus.CREATED).body(ambulanceDto);
////
////    }
//
//    @PostMapping(value = "/lalitpur")
//    @ResponseStatus(value = HttpStatus.ACCEPTED)
//    public ResponseEntity< List<Ambulance>> ambulanceInLalitpur(){
//        List<Ambulance> filteredList = new ArrayList<>();
//        String comparingStringValue ="Lalitpur";
//        for (Ambulance ambulance : AmbulanceList) {
//            if (ambulance.getAddress().getDistrict().equals(comparingStringValue)) {
//                filteredList.add(ambulance);
//            }
//        }
//
//        return ResponseEntity.status(HttpStatus.ACCEPTED).body(filteredList);
//    }
//
//
//
//}
