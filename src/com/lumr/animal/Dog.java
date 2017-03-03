package com.lumr.animal;

/**
 * Created by FS on 2017/2/23.
 */
public class Dog extends Pet {
    public Dog(){
        super();
        System.out.println("这是一只狗。");
    }
    public Dog(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void bite(){
        System.out.println("咬人");
    }

}
