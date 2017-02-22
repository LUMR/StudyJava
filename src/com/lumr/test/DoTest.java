package com.lumr.test;


/**
 * Created by lumr on 2017/2/21.
 */
public class DoTest {
    public DoTest() {

    }

    //    nothing to do now
    public static void main(String[] args) {
        System.out.println("看我做测试：");
        DoTest newtest = new DoTest();
        newtest.show();
        newtest.test();
        System.out.println("str");

    }

    public void show(){
        System.out.println("sout");
        System.out.printf("看得我有点晕");

    }

    public void test(){
        String str = "start";
        for (int i = 0; i < 5; i++) {
            str += "none";
        }

    }
}
