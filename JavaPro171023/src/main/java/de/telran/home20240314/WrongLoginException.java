package de.telran.home20240314;

public class WrongLoginException extends RuntimeException {
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}