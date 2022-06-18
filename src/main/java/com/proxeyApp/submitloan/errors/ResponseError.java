package com.proxeyApp.submitloan.errors;

import java.io.Serializable;

public class ResponseError implements Serializable{

    private static final long serialVersionUID = 1L;

    private final String type;
    private final int stauts;
    private final String code;
    private final String message;

    public ResponseError(String type, int stauts, String code, String message) {
        this.type = type;
        this.stauts = stauts;
        this.code = code;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public int getStauts() {
        return stauts;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
