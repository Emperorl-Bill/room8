package com.room8.authservice.exception;

public class NoMatchingUserFoundException extends RuntimeException {

    public NoMatchingUserFoundException(String username) {
        super("No user found with email matching {} " + username);
    }
}
