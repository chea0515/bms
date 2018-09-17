package com.cc.utils;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;
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

    public static ResultError error(Integer code, String message, String type) {
        return new ResultError(code, type + ":" + LineSeparator.Web + message);
    }
}
