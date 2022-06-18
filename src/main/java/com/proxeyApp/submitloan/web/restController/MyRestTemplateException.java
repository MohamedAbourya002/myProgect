package com.proxeyApp.submitloan.web.restController;

import org.springframework.http.HttpStatus;

public class MyRestTemplateException extends RuntimeException {

    private DownstreamApi api;
    private HttpStatus statusCode;
    private String error;

    public MyRestTemplateException(DownstreamApi api, HttpStatus statusCode, String error) {
        super(error);
        this.api = api;
        this.statusCode = statusCode;
        this.error = error;
    }

    // TODO getters ...
    // TODO toString ...
}

