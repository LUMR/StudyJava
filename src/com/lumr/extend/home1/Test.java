package com.lumr.extend.home1;

import com.lumr.extend.home2.Son;

/**
 * Created by work on 2017/6/23.
 *
 * @author lumr
 */
public class Test {
    public static void main(String[] args) {
        Son son = new Son("");
        Father father = new Son("");
        Father mother = son;
        System.out.println(father.getName());
        System.out.println(mother.getName());
        mother = (Father)son;
        System.out.println(mother.getName());
    }
}
