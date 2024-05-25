package com.restaurantapp.restaurant.exceptions;

public class BoissonNotFoundException extends RuntimeException {
    public BoissonNotFoundException(String message) {
        super(message);
    }
}
