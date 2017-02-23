package com.lumr.test;


import com.lumr.animal.*;

/**
 * Created by lumr on 2017/2/21.
 * @author FS
 */
public class DoTest {

    //    nothing to do now
    public static void main(String[] args) {
        Pet mypet = new Dog("狗", 1, "雄性");
        Pet thepet = new Penguin("奇尔", 1, "磁性");
        Penguin pen = (Penguin) thepet;
        Dog dog = (Dog) mypet;
        dog.bite();
        pen.fly();
    }

}
