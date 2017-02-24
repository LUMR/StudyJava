package com.lumr.job;

import com.lumr.abstractClasses.Person;

/**
 * Created by FS on 2017/2/23.
 */
public class Student extends Person{
    private int id;
    private String name;
    private int age;
    private String major;

    public Student() {
        this.id = 0;
        this.name = "丽丽";
        this.age = 17;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String getDescription() {
        return "a student majoring in" + major;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        if (id != student.id) return false;
        if (age != student.age) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;
        return result;
    }
}
