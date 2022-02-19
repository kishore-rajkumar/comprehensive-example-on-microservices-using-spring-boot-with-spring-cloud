package com.airport.checking;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.airport.checking.controller.CheckingController;

@SpringBootTest
class AirportCheckingServiceApplicationTests {

	@Autowired
	private CheckingController checkingController;

	@Test
	void contextLoads() throws Exception {
		assertThat(checkingController).isNotNull();
	}

}
