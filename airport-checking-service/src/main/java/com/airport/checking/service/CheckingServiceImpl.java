/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.checking.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airport.checking.entity.CheckingEntity;
import com.airport.checking.exception.CheckingCustomException;
import com.airport.checking.repository.CheckingRepository;
import com.airport.checking.request.Checking;
import com.airport.checking.response.CheckingResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CheckingServiceImpl implements CheckingService {

	private static final ModelMapper modelMapper = new ModelMapper();

	@Autowired
	CheckingRepository checkingRepository;

	@Override
	public CheckingResponse createChecking(Checking checking) {

		/* throw a custom exception on a condition */
		/*
		 * we choose 6xx series for custom exception as 1xx, 2xx, 3xx, 4xx are reserved
		 */
		if (checking.getCovidReport().equals("positive") || checking.getCovidReport().equals("Not Available"))
			throw new CheckingCustomException("600",
					"You are not allowed! Either your covid report is +ve or you did not do covid testing.");

		log.info("saving checking check id " + checking.getBookingId());

		/* map checking input object to checking entity object automatically */
		CheckingEntity checkingEntity = modelMapper.map(checking, CheckingEntity.class);

		checkingRepository.save(checkingEntity);

		log.info("saved checking check id " + checking.getBookingId());

		return new CheckingResponse(checkingEntity);
	}

	@Override
	public CheckingResponse getCheckingById(Long id) {
		log.info("fetching checking by checking id " + id);
		CheckingEntity checkingEntity = checkingRepository.findById(id).get();
		return new CheckingResponse(checkingEntity);
	}

	@Override
	public CheckingResponse findCheckingByBookingId(Long bookingId) {
		log.info("fetching checking by booking id " + bookingId);
		CheckingEntity checkingEntity = checkingRepository.findByBookingId(bookingId).get();
		return new CheckingResponse(checkingEntity);
	}
}