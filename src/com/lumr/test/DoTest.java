package com.lumr.test;


import com.lumr.animal.*;
import com.lumr.throwableClass.ErrorException;

import java.util.Scanner;

/**
 * 专门做些乱七八糟的测试和验证
 * Created by lumr on 2017/2/21.
 * @author FS
 */
public class DoTest {

    public static void main(String[] args) throws ErrorException {
        DoTest test = new DoTest();
        Dog mydog = new Dog();
        System.out.println(mydog);
        test.test();
        String ms = test.readDate();
        System.out.println(ms);
        System.out.println(test.test(2));
        test.test1();
    }

    /**
     * 验证继承
     */
    public void test(){
        Pet mypet = new Dog("狗", 1, "雄性");
        Pet thepet = new Penguin("奇尔", 1, "磁性");
        Penguin pen = (Penguin) thepet;
        Dog dog = (Dog) mypet;
        dog.bite();
        System.out.println(dog.getName()+dog.getSex()+dog.getSex());
        pen.fly();
    }

    /**
     * 验证返回值的类型转换
     * @param a int
     * @param b int
     * @return double
     */
    public double test(int a, int b){
        return (a/b);
    }

    /**
     * 抛出异常测试
     * @return no
     * @throws ErrorException 异常
     */
    public String readDate() throws ErrorException {
        try {
            String str = "I am the world";
            if (!str.equals("you are sb."))
                throw new ErrorException("又点啊？");
            return str;
        }catch (ErrorException e){
            System.out.println("唔好意思，出错啦！");
            return "无错就系出错啦";
        }
//        return "出错又点啊";
    }

    /**
     * 测试finally语句
     * @param n 测试
     * @return 这里将如果n == 2,这里的返回值为0
     */
    public int test(int n){
        try
        {
            int r = n * n;
            return r;
        }
        finally {
            if (n == 2) return 0;
        }
    }

    /**
     * 断言assert
     * 要启用断言需要在运行是添加参数：-enableassertions
     */
    public void test1(){
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个数字：");
        int a = input.nextInt();
        assert a > 5 : "a要大于5啊！";
        System.out.println(a);
    }
}
