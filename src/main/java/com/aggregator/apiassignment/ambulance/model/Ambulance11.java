package com.aggregator.apiassignment.ambulance.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class Ambulance11 {
    private String id ;
    private String name;
    private String affiliatedHospital;
    private Double longitude;
    private Double latitude;
    private AddressOfAmbulance address = null;
    private boolean isAllHourService;
    private boolean isOpen;
    private AmbulanceDetails ambulanceDetails = null;
    private ContactDetails contactDetails = null;
    private LocalDateTime CreatedTime;
//            = (java.time.LocalDateTime.now());

//
//
//
//    AmbulanceDetails ambulanceDetails1 = new AmbulanceDetails("Public",true,false,5.0,50.0);
//    AmbulanceDetails ambulanceDetails2 = new AmbulanceDetails("Private",true,true,8.0,100.0);
//    AmbulanceDetails ambulanceDetails3 = new AmbulanceDetails("Public",true,false,5.0,50.0);
//    AmbulanceDetails ambulanceDetails4 = new AmbulanceDetails("Private",true,true,8.0,100.0);
//    AmbulanceDetails ambulanceDetails5 = new AmbulanceDetails("Public",true,false,5.0,50.0);
//    AmbulanceDetails ambulanceDetails6 = new AmbulanceDetails("Private",true,true,8.0,100.0);
//
//    AddressOfAmbulance addressOfAmbulance1 = new AddressOfAmbulance("Baneshwor","Kathmandu","Bagmati");
//    AddressOfAmbulance addressOfAmbulance2 = new AddressOfAmbulance("Patan","Lalitpur","Bagmati");
//    AddressOfAmbulance addressOfAmbulance3 = new AddressOfAmbulance("Balaju","Kathmandu","Bagmati");
//    AddressOfAmbulance addressOfAmbulance4 = new AddressOfAmbulance("YekantaKuna","Lalitpur","Bagmati");
//    AddressOfAmbulance addressOfAmbulance5 = new AddressOfAmbulance("Lainchaur","Kathmandu","Bagmati");
//    AddressOfAmbulance addressOfAmbulance6 = new AddressOfAmbulance("Gwarkho","Lalitpur","Bagmati");
//
//    ContactDetails contactDetails1 = new ContactDetails(List.of("civilhospital1@gmail.com","civilhospital2@gmail.com"),List.of("456123658","0156478965"),List.of("01563654789","0125478965"),"www.civilhospital.com");
//    ContactDetails contactDetails2 = new ContactDetails(List.of("alkahospital1@gmail.com","alkahospital2@gmail.com"),List.of("0226123658","0162478965"),List.of("01666654789","01364478965"),"www.alkahospital.com");
//    ContactDetails contactDetails3 = new ContactDetails(List.of("Janamaitri1@gmail.com","Janamaitri2@gmail.com"),List.of("456123658","0156478965"),List.of("01563654789","0125478965"),"www.Janamaitri.com");
//    ContactDetails contactDetails4 = new ContactDetails(List.of("Omganesh1@gmail.com","Omganesh2@gmail.com"),List.of("0226123658","0162478965"),List.of("01666654789","01364478965"),"www.Omganesh.com");
//    ContactDetails contactDetails5 = new ContactDetails(List.of("lainchaurcare1@gmail.com","lainchaurcare2@gmail.com"),List.of("456123658","0156478965"),List.of("01563654789","0125478965"),"www.lainchaurcare.com");
//    ContactDetails contactDetails6 = new ContactDetails(List.of("bandb1@gmail.com","bandb2@gmail.com"),List.of("0226123658","0162478965"),List.of("01666654789","01364478965"),"www.bandb.com");
//
//
//    Ambulance ambulance1=new Ambulance(UUID.randomUUID().toString(),"Civil Express Ambulance","Civil Hospital",27.27,87.87,addressOfAmbulance1,true,true,ambulanceDetails1,contactDetails1,java.time.LocalDateTime.now());
//    Ambulance ambulance2=new Ambulance(UUID.randomUUID().toString(),"Alka Express Sewa","Alka Hospital",37.37,77.77,addressOfAmbulance2,false,true,ambulanceDetails2,contactDetails2,java.time.LocalDateTime.now());
//    Ambulance ambulance3=new Ambulance(UUID.randomUUID().toString(),"Janamaitri Sewa","Janamaitri Hospital",27.27,87.87,addressOfAmbulance3,true,true,ambulanceDetails3,contactDetails3,java.time.LocalDateTime.now());
//    Ambulance ambulance4=new Ambulance(UUID.randomUUID().toString(),"Om Ganesh Express Sewa","Om Ganesh  Hospital",37.37,77.77,addressOfAmbulance4,false,true,ambulanceDetails4,contactDetails4,java.time.LocalDateTime.now());
//    Ambulance ambulance5=new Ambulance(UUID.randomUUID().toString(),"lainchaur Care Express Ambulance","lainchaur Care Hospital",27.27,87.87,addressOfAmbulance5,true,true,ambulanceDetails5,contactDetails5,java.time.LocalDateTime.now());
//    Ambulance ambulance6=new Ambulance(UUID.randomUUID().toString(),"B&B Express Sewa","B&B Hospital",37.37,77.77,addressOfAmbulance6,false,true,ambulanceDetails6,contactDetails6,java.time.LocalDateTime.now());
//    List<Ambulance>AmbulanceList = List.of(ambulance1,ambulance2,ambulance3,ambulance4,ambulance5,ambulance6);



}
