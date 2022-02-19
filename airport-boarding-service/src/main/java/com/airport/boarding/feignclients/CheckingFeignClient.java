/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.boarding.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.airport.boarding.response.CheckingResponse;

/* airport-checking-service is the path as per the eureka server console */

@FeignClient(value = "api-gateway/airport-checking-service")
public interface CheckingFeignClient {

	@GetMapping("/api/v1/checking/find-by-booking-id/{bookingId}")
	public ResponseEntity<CheckingResponse> findCheckingByBookingId(@PathVariable Long bookingId);
}