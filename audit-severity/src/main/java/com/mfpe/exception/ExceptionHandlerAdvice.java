package com.mfpe.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.mfpe.model.AuditResponse;

@ControllerAdvice
public class ExceptionHandlerAdvice {
	
	Logger logger = LoggerFactory.getLogger("Benchmark-Exception-Handler-Advice");
	
	// here handling any exception occurs during validation...
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<?> exception(Exception e) {
		logger.error(e.getMessage());
		AuditResponse auditResponse = new AuditResponse();
		return new ResponseEntity<>(auditResponse, HttpStatus.OK);
	}
}
