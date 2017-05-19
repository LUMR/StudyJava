package com.lumr.test;

/**
 * Created by fsweb on 17-2-27.
 */
public class Mouse implements Usb,BlueTools {
    public static void main(String[] args) {
        Usb test = new Mouse();
        test.show();
        BlueTools tes = (BlueTools) test;
        tes.link();
    }
    @Override
    public void connect() {
        System.out.println("我是一个鼠标.");
    }

    @Override
    public int getName() {
        return Usb.super.getName();
    }

    @Override
    public void link() {
        System.out.println("蓝牙功能");
    }
}
