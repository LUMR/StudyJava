package com.lumr.generics;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by lumr on 2017/5/21.
 */
public class FibonacciHandler implements InvocationHandler {
    Object proxied;
    private long count = 1;

    public FibonacciHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        if (method.getName().equals("fib"))
            System.out.println("FIB."+method.getName()+"的第" + count++ + "次调用。");
//        System.out.println("proxy:"+proxy+"\t"+"proxied:"+proxied);
        return method.invoke(proxied, args);
    }
}
