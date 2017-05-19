package com.lumr.interfaces.interfaceprocessor;

/**
 * Created by lumr on 2017/5/19.
 */
public class Upcase extends StringProcessor {
    @Override
    public Object process(Object input) {
        return ((String)input).toUpperCase();
    }
}
