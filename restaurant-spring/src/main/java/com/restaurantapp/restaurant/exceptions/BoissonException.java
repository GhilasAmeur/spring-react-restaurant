package com.restaurantapp.restaurant.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@Data
public class BoissonException {
    private final String message;
    private final HttpStatus httpStatus;
}
