package com.DevOps2022.jobopeningservice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevOps2022.jobopeningservice.model.JobOpening;
import com.DevOps2022.jobopeningservice.repositories.JobOpeningRepository;

@Service
public class JobOpeningService {
    @Autowired 
    JobOpeningRepository jobOpeningRepository;

    public String addJobOpening(JobOpening jobOpening) {
        jobOpeningRepository.save(jobOpening);

        return "Job opening successfully added.";
    }

    public List<JobOpening> findJobOpening(String criteria) {
        List<JobOpening> jobs = jobOpeningRepository.findAll();
        List<JobOpening> result = new ArrayList<JobOpening>();

        for(JobOpening jobOpening : jobs) {
            if(jobOpening.getTitle().toLowerCase().contains(criteria.toLowerCase()) || 
                jobOpening.getSeniority().toLowerCase().contains(criteria.toLowerCase()) ||
                jobOpening.getCompany().toLowerCase().contains(criteria.toLowerCase())) {
                    result.add(jobOpening);
                }
        }

        return result;
    }
}
