/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.checking.response;

import com.airport.checking.entity.CheckingEntity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CheckingResponse {

	private long id;

	private String identityProof;

	private String covidReport;

	private String ctScan;

	private String status;

	private long bookingId;

	public CheckingResponse(CheckingEntity checkingEntity) {
		this.id = checkingEntity.getId();
		this.identityProof = checkingEntity.getIdentityProof();
		this.covidReport = checkingEntity.getCovidReport();
		this.ctScan = checkingEntity.getCtScan();
		this.status = checkingEntity.getStatus();
		this.bookingId = checkingEntity.getBookingId();
	}
}
