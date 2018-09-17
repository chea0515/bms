package com.cc.bms.base.exception;

public class BmsException extends RuntimeException {
    private static final long serialVersionUID = -1425976313294834867L;

    public BmsException() {
        super();
    }

    public BmsException(String message) {
        super(message);
    }

    public BmsException(Throwable e) {
        super(e);
    }
    public BmsException(String message, Throwable e) {
        super(message, e);
    }
}
