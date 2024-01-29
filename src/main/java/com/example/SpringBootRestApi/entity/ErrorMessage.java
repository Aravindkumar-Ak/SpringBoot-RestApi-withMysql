package com.example.SpringBootRestApi.entity;

import org.springframework.http.HttpStatusCode;

public class ErrorMessage {
    private HttpStatusCode httpStatusCode;
    private String message;
    public ErrorMessage(){}

    public ErrorMessage(HttpStatusCode httpStatusCode, String message) {
        this.httpStatusCode = httpStatusCode;
        this.message = message;
    }

    public HttpStatusCode getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(HttpStatusCode httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
