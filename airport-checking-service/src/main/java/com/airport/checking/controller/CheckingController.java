/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.checking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airport.checking.request.Checking;
import com.airport.checking.response.CheckingResponse;
import com.airport.checking.service.CheckingService;

@RestController
public class CheckingController {

	@Autowired
	CheckingService checkingService;

	/*
	 * API to save checking details of a passenger
	 * 
	 * @param Checking (identityProof, covidReport, ctScan, status, bookingId)
	 * 
	 * @return CheckingResponse (id, identityProof, covidReport, ctScan, status,
	 * bookingId)
	 */
	@PostMapping("/api/v1/checkings")
	public ResponseEntity<CheckingResponse> createChecking(@RequestBody Checking checking) {
		CheckingResponse checkingResponse = checkingService.createChecking(checking);
		return new ResponseEntity<>(checkingResponse, HttpStatus.CREATED);
	}

	/*
	 * API to get a checking details
	 * 
	 * @param checking id
	 * 
	 * @return CheckingResponse (id, identityProof, covidReport, ctScan, status,
	 * bookingId)
	 */
	@GetMapping("/api/v1/checkings/{id}")
	public ResponseEntity<CheckingResponse> getCheckingById(@PathVariable Long id) {
		CheckingResponse checkingResponse = checkingService.getCheckingById(id);
		return new ResponseEntity<>(checkingResponse, HttpStatus.OK);
	}

	/*
	 * API to find a checking details by booking id
	 * 
	 * @param bookingId
	 * 
	 * @return CheckingResponse (id, identityProof, covidReport, ctScan, status,
	 * bookingId)
	 */
	@GetMapping("/api/v1/checkings/find-by-booking-id/{bookingId}")
	public ResponseEntity<CheckingResponse> findCheckingByBookingId(@PathVariable Long bookingId) {
		CheckingResponse checkingResponse = checkingService.findCheckingByBookingId(bookingId);
		return new ResponseEntity<>(checkingResponse, HttpStatus.OK);
	}
}