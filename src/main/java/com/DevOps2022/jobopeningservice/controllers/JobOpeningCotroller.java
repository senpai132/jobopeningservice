package com.DevOps2022.jobopeningservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevOps2022.jobopeningservice.helper.dto.JobOpeningDTO;
import com.DevOps2022.jobopeningservice.helper.mappers.JobOpeningMapper;
import com.DevOps2022.jobopeningservice.model.JobOpening;
import com.DevOps2022.jobopeningservice.services.JobOpeningService;

@RestController
@CrossOrigin
@RequestMapping("/jobs")
public class JobOpeningCotroller {
    @Autowired
    private JobOpeningService jobOpeningService;

    private JobOpeningMapper jobOpeningMapper;

    @PostMapping("/add")
    public ResponseEntity<String> addJobOpening(@RequestBody JobOpeningDTO dto) {
        JobOpening opening = jobOpeningMapper.toEntity(dto);

        return new ResponseEntity<>(jobOpeningService.addJobOpening(opening), HttpStatus.OK);
    }

    @GetMapping("/find/{criteria}")
    public ResponseEntity<List<JobOpeningDTO>>findJobOpenings(@PathVariable String criteria) {
        return new ResponseEntity<>(jobOpeningMapper.toDtoList(jobOpeningService.findJobOpening(criteria)), HttpStatus.OK);
    }

    public JobOpeningCotroller() {
        this.jobOpeningMapper = new JobOpeningMapper();
    }
}
