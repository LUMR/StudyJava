package com.lumr.interfaces.interfaceprocessor;

/**
 * Created by lumr on 2017/5/19.
 */
public interface Processor {
    String name();

    Object process(Object input);
}
