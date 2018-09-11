package com.cc.bms.base.config;

import com.cc.bms.base.exception.BmsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class BmsControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        //
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody public String runtimeExceptionHandler(RuntimeException ex) {
        log.error("RuntimeException:{}", ex.getMessage());
        return "";
    }

    @ExceptionHandler(BmsException.class)
    @ResponseBody public String bmsExceptionHandler(BmsException ex) {
        log.error("BmsException:{}", ex.getMessage());
        return "";
    }
}
