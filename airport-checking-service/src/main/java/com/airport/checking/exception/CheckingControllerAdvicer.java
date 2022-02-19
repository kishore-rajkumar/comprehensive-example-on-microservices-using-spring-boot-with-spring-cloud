/**
 * @author SIRAJ CHAUDHARY
 * 
 * https://github.com/SirajChaudhary
 * 
 * https://www.linkedin.com/in/sirajchaudhary/
 */

package com.airport.checking.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/* Global Exception Handling */

@ControllerAdvice
public class CheckingControllerAdvicer extends ResponseEntityExceptionHandler {

	/* Custom Exception Handler */
	@ExceptionHandler(CheckingCustomException.class)
	public ResponseEntity<Map<String, Object>> handleCheckingCustomException(
			CheckingCustomException checkingCustomException) {

		Map<String, Object> body = new LinkedHashMap<>();
		body.put("timestamp", LocalDateTime.now());
		body.put("message", checkingCustomException.getErrorMessage());
		body.put("status", checkingCustomException.getErrorCode());

		return new ResponseEntity<>(body, HttpStatus.BAD_REQUEST);
	}
}