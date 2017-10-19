package com.lumr.extend.home2;

import com.lumr.extend.home1.Father;

/**
 * Created by work on 2017/6/23.
 *
 * @author lumr
 */
public class Son extends Father {
    private String name = "儿子";

    public Son(String name) {
        this.name = name;
    }

    public String getName() {
        return "儿子";
    }

    public void setName(String name) {
        this.name = name;
    }
}
