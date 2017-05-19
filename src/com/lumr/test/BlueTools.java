package com.lumr.test;

/**
 * Created by fsweb on 17-2-27.
 */
public interface BlueTools {
    void link();
    default int getName(){
        return 3;
    }

}
