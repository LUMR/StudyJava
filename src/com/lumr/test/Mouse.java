package com.lumr.test;

/**
 * Created by fsweb on 17-2-27.
 */
public class Mouse implements Usb,BlueTools {
    @Override
    public void connect() {
        System.out.println("我是一个鼠标.");
    }

    @Override
    public void link() {
        System.out.println("蓝牙功能");
    }
}
