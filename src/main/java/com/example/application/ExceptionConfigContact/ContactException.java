package com.example.application.ExceptionConfigContact;

public class ContactException extends RuntimeException{
    private String message;
    public ContactException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
