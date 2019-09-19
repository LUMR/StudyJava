package com.lumr.returnValue;

/**
 * @author lumr
 * @since 2019/9/4 下午10:31
 */
public class TestReturn {

    public static void main(String[] args) {
        int a = fin();
        System.out.println(a);
    }

    public static int fin(){
        int a;
        try {
            a = 1;
            if (true)
                throw new RuntimeException("a");
            return a;
        }catch (Exception e){
            a = 2;
            return a;
        }finally {
            return a = 3;
        }
    }
}
