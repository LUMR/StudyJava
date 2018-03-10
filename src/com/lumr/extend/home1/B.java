package com.lumr.extend.home1;

public class B extends A{
    static {
        System.out.printf("a");
    }

    public B() {
        super("d");
        System.out.printf("b");
    }
}
