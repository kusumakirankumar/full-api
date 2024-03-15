package com.application.backend.exception.advice;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ExceptionAdvice {

    private final String message;

    private final HttpStatus status;

    private Throwable cause;

}
