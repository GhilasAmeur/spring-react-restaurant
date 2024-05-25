package com.restaurantapp.restaurant.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BoissonExceptionHandler {
    @ExceptionHandler(value = {BoissonNotFoundException.class})
    public ResponseEntity<Object> handleBoissonNotFoundException
            (BoissonNotFoundException boissonNotFoundException){
        BoissonException boissonException =   new BoissonException(
                boissonNotFoundException.getMessage(),

                HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(boissonException,HttpStatus.NOT_FOUND);

    }}
