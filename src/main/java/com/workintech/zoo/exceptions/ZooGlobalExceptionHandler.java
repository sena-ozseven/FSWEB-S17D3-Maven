package com.workintech.zoo.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@Slf4j
@ControllerAdvice //--> This annotation makes is a GlobalExceptionHandler
public class ZooGlobalExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ZooErrorResponse> handleException(ZooException exception) {
        ZooErrorResponse zooErrorResponse = new ZooErrorResponse(exception.getHttpStatus().value(), exception.getLocalizedMessage(),System.currentTimeMillis());
    }
}
