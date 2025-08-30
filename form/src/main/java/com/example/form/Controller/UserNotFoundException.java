package com.example.form.Controller;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String notFound) {
        super(notFound);
    }
}
