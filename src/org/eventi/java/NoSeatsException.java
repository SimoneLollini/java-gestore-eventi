package org.eventi.java;

public class NoSeatsException extends RuntimeException{
    public NoSeatsException(String message) {
        super(message);
    }
}

