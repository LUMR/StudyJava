package com.lumr.interfaces.interfaceprocessor;

/**
 * Created by lumr on 2017/5/19.
 */
public abstract class StringProcessor implements Processor {
    public static String s = "If she weighs the same as a duck, she's made of wood.";

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input);
}
