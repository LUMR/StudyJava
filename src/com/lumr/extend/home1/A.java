package com.lumr.extend.home1;

public class A {
    static {
        System.out.printf("1");
    }

    public A() {
        System.out.printf("2");
    }

    public A(String s){
        System.out.printf("3");
    }
}
