/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.boarding.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardingResponse {

	private CheckinResponse checkinResponse;
	private CheckingResponse checkingResponse;
	private BookingResponse bookingResponse;
}