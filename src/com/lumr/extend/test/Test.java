package com.lumr.extend.test;

import com.lumr.extend.home1.Father;
import com.lumr.extend.home2.Son;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by work on 2017/6/23.
 *
 * @author lumr
 */
public class Test {
    public static void main(String[] args) {
        try {
            Father father = (Father) Class.forName(Son.class.getName()).getConstructor(String.class).newInstance();
            System.out.println(father.getName());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
