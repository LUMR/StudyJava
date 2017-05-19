package com.lumr.interfaces.interfaceprocessor;

import java.util.Arrays;

/**
 * Created by lumr on 2017/5/19.
 */
public class Splitter extends StringProcessor {
    @Override
    public Object process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
