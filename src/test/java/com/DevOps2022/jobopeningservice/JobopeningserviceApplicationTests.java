package com.DevOps2022.jobopeningservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.DevOps2022.jobopeningservice.model.JobOpening;
import com.DevOps2022.jobopeningservice.repositories.JobOpeningRepository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

@SpringBootTest
class JobopeningserviceApplicationTests {

	@Autowired
	private JobOpeningRepository jobOpeningRepository;

	@Test
	void testGetUserByUsername() {
		JobOpening u = jobOpeningRepository.findById(1001).get();
		assertThat(u).isNotNull();
	}

	@Test
	void testGetAllUsers() {
		List<JobOpening> users = jobOpeningRepository.findAll();
		assertThat(users.size()).isGreaterThan(0);
	}

}
