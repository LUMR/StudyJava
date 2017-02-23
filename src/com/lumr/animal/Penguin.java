package com.lumr.animal;

/**
 * Created by FS on 2017/2/23.
 */
public class Penguin extends Pet {
    public Penguin(String name, int age, String sex) {
        super(name, age, sex);
    }

    public void fly(){
        System.out.println("傻了吧，爷会飞");
    }
}
