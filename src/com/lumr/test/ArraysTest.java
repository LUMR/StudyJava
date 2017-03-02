package com.lumr.test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 集合
 * Created by fsweb on 17-3-2.
 */
public class ArraysTest {
    public static void main(String[] args) {
        /**
         * 查询的效率比较高
         */
        //集合的优势:1.长度无限 2.没有数据限制
        String name = "my god";
        String name1 = "my god";
        String name2 = "my goo";
        String name3 = "my god";
        //定义集合对象
        ArrayList array = new ArrayList();

        //往集合放东西
        array.add(name);
        array.add(name1);
        array.add(name2);
        array.add(name3);

        //看看集合的长度
        System.out.println(array.size());

        //检查是否存在指定的值
        System.out.println(array.contains("my goo"));

        //删除
        array.remove(2);

        //集合历遍
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        /**
         * 链表
         * 增删改时效率高
         */
        LinkedList list = new LinkedList();
        list.add(name);
        list.add(name1);
        list.addFirst(name2);//可以插队
        System.out.println(list.get(0));


    }
}
