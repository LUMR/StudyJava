package com.lumr.interfaces;

/**
 * Created by lumr on 2017/5/19.
 */
public class A {
    public static void main(String[] args) {
        A a = new A();

    }
    interface B {
        void f();
    }

    public class BImpl implements B {
        @Override
        public void f() {
            System.out.println("f");
        }
    }
}
