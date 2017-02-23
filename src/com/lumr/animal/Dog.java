package com.lumr.animal;

/**
 * Created by FS on 2017/2/23.
 */
public class Dog extends Pet {
    public Dog(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void bite(){
        System.out.println("咬人");
    }
}
