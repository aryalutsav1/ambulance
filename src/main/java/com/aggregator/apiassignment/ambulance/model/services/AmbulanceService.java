package com.aggregator.apiassignment.ambulance.model.services;

import com.aggregator.apiassignment.ambulance.model.AddressOfAmbulance;
import com.aggregator.apiassignment.ambulance.model.Ambulance;
import com.aggregator.apiassignment.ambulance.model.AmbulanceDetails;
import com.aggregator.apiassignment.ambulance.model.ContactDetails;
import com.aggregator.apiassignment.ambulance.model.dtos.AmbulancesDto;
import com.aggregator.apiassignment.ambulance.repository.AmbulanceRepository;
import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AmbulanceService {

    @Autowired
    AmbulanceRepository ambulanceRepository;


    public Iterable<Ambulance> getAmbulanceList() {
        return ambulanceRepository.findAll();
    }

    public Optional<Ambulance> getAmbulanceDetail(Long ambulanceId) {

        Ambulance ambulance = new Ambulance("Patan Express", "Patan Hospital", 65.65, 39.39, "Lalitpur", true, LocalDateTime.now());
        return Optional.of(ambulance);
    }

    public Ambulance createAmbulance(AmbulancesDto ambulancesDto) {
        Ambulance ambulance = new Ambulance(ambulancesDto.getName(), ambulancesDto.getAffiliatedHospital(), ambulancesDto.getLongitude(), ambulancesDto.getLatitude(), ambulancesDto.getDistrict(), ambulancesDto.isOpen(), LocalDateTime.now());
        return ambulanceRepository.save(ambulance);
    }

    public Ambulance updateAmbulance(Long ambulanceId, AmbulancesDto ambulancesDto) {

        Optional<Ambulance> optionalAmbulance = ambulanceRepository.findById(ambulanceId);

        if (optionalAmbulance.isPresent()) {
            // Code to update
            Ambulance ambulanceToUpdate = optionalAmbulance.get();
            ambulanceToUpdate.setName(ambulancesDto.getName());
            ambulanceToUpdate.setAffiliatedHospital(ambulancesDto.getAffiliatedHospital());
            ambulanceToUpdate.setDistrict(ambulancesDto.getDistrict());
            ambulanceToUpdate.setOpen(ambulancesDto.isOpen());
            ambulanceToUpdate.setLongitude(ambulancesDto.getLongitude());
            ambulanceToUpdate.setLatitude(ambulancesDto.getLatitude());


            return ambulanceRepository.save(ambulanceToUpdate);
        } else {
            throw new RuntimeException(String.format("The ambulance with the id %d is not present", ambulanceId));
        }


    }

    public void deleteAmbulance(Long ambulanceID) {
        ambulanceRepository.deleteById(ambulanceID);
    }
}
