package com.lumr.throwableClass;

import java.io.IOException;

/**
 * 异常类，测试用
 * Created by lumr on 2017/2/28.
 */
public class ErrorException extends IOException {
    public ErrorException() {}
    public ErrorException(String gripe){
        super(gripe);
    }
}
