package com.lumr.typeinfo;

import java.lang.reflect.Proxy;

/**
 * 动态代理
 * Created by lumr on 2017/5/21.
 */
public class SimpleDynamicProxy {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("no");
    }

    public static void main(String[] args) {
        selectingProxy();
    }

    /**
     * 带方法过滤的动态代理
     */
    public static void selectingProxy(){
        SomeMethods proxy = (SomeMethods) Proxy.newProxyInstance(SomeMethods.class.getClassLoader(), new Class[]{SomeMethods.class}, new MethodSelectorHandler(new SomeMethodsImpl()));
        proxy.boring1();
        proxy.boring2();
        proxy.interesting("有趣");
        System.out.println(proxy.boring3());
    }

    /**
     * 简单的动态代理
     */
    public static void simpleProxy() {
        RealObject real = new RealObject();
        consumer(real);
        //Insert a proxy and call again;
        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(real));
        consumer(proxy);
    }

}
