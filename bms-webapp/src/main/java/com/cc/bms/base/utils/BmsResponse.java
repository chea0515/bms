package com.cc.bms.base.utils;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BmsResponse<T> {
    private Boolean success = true;
    private T result;
}
