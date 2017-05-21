package com.lumr.typeinfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 带过滤的代理Handler
 * Created by lumr on 2017/5/21.
 */
public class MethodSelectorHandler implements InvocationHandler {
    //被代理的对象
    private Object proxied;

    public MethodSelectorHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("interesting"))
            System.out.println("Proxy detected the interesting method");
        Object result = method.invoke(proxied, args);
        System.out.print("返回的Object是： ");
        if (result == null)
            System.out.print(result+"\n");
        else
            System.out.print(result.getClass()+"\n");
        return result;
    }
}
