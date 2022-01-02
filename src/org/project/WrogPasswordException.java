package org.project;

public class WrogPasswordException extends Exception {
    private String detail;

    public WrogPasswordException() {
        detail = "Incorrect password";
    }

    public WrogPasswordException(String message) {
        super(message);
        detail = message;
    }

    @Override
    public String toString() {
        return "WrongPasswordException: " + detail;
    }
}