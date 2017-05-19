package com.lumr.test;

/**
 * 接口使用示例
 * Created by fsweb on 17-2-27.
 */
public interface Usb {
    public int a = 10;
    public void connect();
    //默认方法
    default void show(){
        System.out.println("默认的啊");
    }
    default int getName(){
        return 0;
    }
}
