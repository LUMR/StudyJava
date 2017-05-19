package com.lumr.interfaces.interfaceprocessor;

/**
 * Created by lumr on 2017/5/19.
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using Processor "+ p.name());
        System.out.println(p.process(s));
    }
}
