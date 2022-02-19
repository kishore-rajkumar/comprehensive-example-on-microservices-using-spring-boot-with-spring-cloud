package com.airport.checking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.airport.checking.controller", "com.airport.checking.service", "com.airport.checking.exception" })
@EntityScan("com.airport.checking.entity")
@EnableJpaRepositories("com.airport.checking.repository")
@EnableEurekaClient
public class AirportCheckingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirportCheckingServiceApplication.class, args);
	}
}