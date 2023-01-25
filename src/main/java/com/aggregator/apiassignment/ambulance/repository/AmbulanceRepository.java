package com.aggregator.apiassignment.ambulance.repository;

import com.aggregator.apiassignment.ambulance.model.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmbulanceRepository  extends JpaRepository<Ambulance, Long> {
}
