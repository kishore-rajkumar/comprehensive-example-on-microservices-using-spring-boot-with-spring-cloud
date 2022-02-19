/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.checking.service;

import com.airport.checking.request.Checking;
import com.airport.checking.response.CheckingResponse;

public interface CheckingService {

	CheckingResponse createChecking(Checking checking);

	CheckingResponse getCheckingById(Long id);

	CheckingResponse findCheckingByBookingId(Long bookingId);
}