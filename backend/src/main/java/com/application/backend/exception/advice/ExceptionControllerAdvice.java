package com.application.backend.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.application.backend.exception.CustomerFoundException;
import com.application.backend.exception.CustomerNotFoundException;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(value = { CustomerFoundException.class })
    public ResponseEntity<Object> handleCustomerFoundException(
            CustomerFoundException customerFoundException) {
        ExceptionAdvice advice = new ExceptionAdvice(customerFoundException.getMessage(),
                HttpStatus.ALREADY_REPORTED, customerFoundException.getCause());
        return new ResponseEntity<Object>(advice, HttpStatus.ALREADY_REPORTED);
    }

    @ExceptionHandler(value = { CustomerNotFoundException.class })
    public ResponseEntity<Object> handleCustomerNotFoundException(CustomerNotFoundException customerNotFoundException) {
        ExceptionAdvice advice = new ExceptionAdvice(customerNotFoundException.getMessage(),
                HttpStatus.BAD_REQUEST, customerNotFoundException.getCause());
        return new ResponseEntity<Object>(advice, HttpStatus.BAD_REQUEST);
    }
}
