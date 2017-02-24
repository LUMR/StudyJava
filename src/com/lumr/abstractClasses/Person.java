package com.lumr.abstractClasses;

/**
 * Created by FS on 2017/2/24.
 */
public abstract class Person {
    /**
     * 抽象类，不需要写东西
     * @return
     */
    public abstract String getDescription();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
