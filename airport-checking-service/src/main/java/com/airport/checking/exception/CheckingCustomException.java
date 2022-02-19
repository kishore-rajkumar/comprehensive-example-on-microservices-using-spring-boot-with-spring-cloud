/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.checking.exception;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/* Custom Exception */
/* You can have various fields and constructors in it */
@SuppressWarnings("serial")
@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CheckingCustomException extends RuntimeException {

	private String errorCode; //NOSONAR
	private String errorMessage; //NOSONAR
}