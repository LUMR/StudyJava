package com.lumr.generics;

import java.lang.reflect.Proxy;

/**
 * Created by lumr on 2017/5/21.
 */
public class Fibonacci implements FibInterface<Integer> {
    private int count = 0;

    @Override
    public int fib(int n){
        if (n<2)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }
    @Override
    public Integer next() {
        return fib(count++);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        FibInterface proxy = (FibInterface) Proxy.newProxyInstance(Fibonacci.class.getClassLoader(),
                new Class[]{FibInterface.class}, new FibonacciHandler(gen));
        for (int i =0;i<20;i++) {
            System.out.print(proxy.next()+"\n");
        }
    }
}
