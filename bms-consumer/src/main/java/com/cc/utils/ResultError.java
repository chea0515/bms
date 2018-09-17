package com.cc.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultError {

    private Integer code;
    private String message;

    public ResultError() {}

    public ResultError(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultError error(Integer code, String message) {
        return new ResultError(code, message);
    }
}
