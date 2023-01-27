package com.aggregator.apiassignment.ambulance.model.services;

import com.aggregator.apiassignment.ambulance.exception.AmbulanceNotFoundException;
import com.aggregator.apiassignment.ambulance.model.Ambulance;
import com.aggregator.apiassignment.ambulance.model.dtos.AmbulancesDto;
import com.aggregator.apiassignment.ambulance.repository.AmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AmbulanceService {

    @Autowired
    AmbulanceRepository ambulanceRepository;


    public Iterable<Ambulance> getAmbulanceList() {
        return ambulanceRepository.findAll();
    }

    public Ambulance getAmbulanceDetail(Long ambulanceId) {

        Optional<Ambulance> optionalAmbulance = ambulanceRepository.findById(ambulanceId);
        if(optionalAmbulance.isPresent()) {
            return optionalAmbulance.get();
        }else {
            throw new AmbulanceNotFoundException(String.format("The ambulance with Id %d is not present in database",ambulanceId),404);
        }


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
        try{
            ambulanceRepository.deleteById(ambulanceID);
        }catch (EmptyResultDataAccessException ex){
            throw new AmbulanceNotFoundException(String.format("Delete function cannot be operated because the id %d is not present in database",
                    ambulanceID),404);
        }

    }
}
