package com.example.application.newproject.RestApiProject.response;

public class RestApiException extends RuntimeException{
    public RestApiException(String message) {
        super(message);
    }
}
