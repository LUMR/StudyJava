package com.lumr.typeinfo;

import com.lumr.animal.Pet;

/**
 * Created by lumr on 2017/5/21.
 */
public class SomeMethodsImpl implements SomeMethods {
    @Override
    public void boring1() {
        System.out.println("boring1");
    }

    @Override
    public void boring2() {
        System.out.println("boring2");
    }

    @Override
    public Pet interesting(String arg) {
        System.out.println("interesting " + arg);
        return new Pet(arg,1,"boy");
    }

    @Override
    public int boring3() {
        System.out.println("boring3");
        return 3;
    }
}
