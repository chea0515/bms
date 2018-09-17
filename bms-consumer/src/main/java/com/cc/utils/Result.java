package com.cc.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result<T> {
    private Boolean success = true;
    private T result;
}
