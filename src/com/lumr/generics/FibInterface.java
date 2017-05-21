package com.lumr.generics;

/**
 * Created by lumr on 2017/5/21.
 */
public interface FibInterface<I extends Number> extends Generator {
    int fib(int i);
}
