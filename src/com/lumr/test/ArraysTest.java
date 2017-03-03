package com.lumr.test;

import com.lumr.animal.Dog;

import java.sql.ResultSet;
import java.util.*;

/**
 * 集合
 * Created by fsweb on 17-3-2.
 */
public class ArraysTest {
    public static void main(String[] args) {
        ArraysTest test = new ArraysTest();
        test.setlist();
        test.hashmap();
    }

    public void arrayslist(){
        List<Dog> ls = new ArrayList<Dog>();

        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog("狗"+i,i+10,"雄");
            ls.add(dog);
        }

        for (int i = 0; i < 3; i++) {
            Dog dog = ls.get(i);
            System.out.println(dog);
        }
    }
    public void note() {
        /**
         * 查询的效率比较高
         */
        //集合的优势:1.长度无限 2.没有数据限制
        String name = "my god";
        String name1 = "my god";
        String name2 = "my goo";
        String name3 = "my god";
        //定义集合对象
        /**
         * 在内存中分配连续的空间,历遍元素和随机访问元素的效率比较高
         */
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
         * 链表,采用链表存储方式
         * 增删改时效率高
         */
        LinkedList list = new LinkedList();
        list.add(name);
        list.add(name1);
        list.addFirst(name2);//可以插队
        System.out.println(list.get(0));


    }
    public void setlist(){
        Set<Dog> set = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog("狗"+i,i+10,"雄");
            set.add(dog);
        }

        Iterator<Dog> ite = set.iterator();
        for (int i = 0; ite.hasNext(); i++) {
            System.out.println(ite.next());
        }
    }
    public void hashmap(){
        Map<String,Dog> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog("狗"+i,i+10,"雄");
            map.put(String.valueOf(i),dog);
        }

        map.forEach((k,v) -> System.out.println("k="+k+",value="+v));

        Set rst = map.keySet();
        Iterator<String> ite = rst.iterator();
        while (ite.hasNext()){
            System.out.println(map.get(ite.next()));
        }
    }


}
