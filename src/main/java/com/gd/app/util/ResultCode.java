package com.gd.app.util;

/**
 * @author Gaurang Deshpande
 */
public enum ResultCode {

    SUCCESS("SUCCESS"),
    BAD_REQUEST("BAD_REQUEST"),
    ERROR("ERROR");

    private String value;

    ResultCode(String value) {
        this.value = value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
