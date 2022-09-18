package com.DevOps2022.jobopeningservice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevOps2022.jobopeningservice.model.JobOpening;

public interface JobOpeningRepository extends JpaRepository<JobOpening, Integer>{
    Optional<JobOpening> findById(Integer id);
}
