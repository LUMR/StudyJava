package com.lumr.concurrency.shareResource;

/**
 * Created by lumr on 2017/5/25.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;
    public static int nextSerialNumber(){
        return serialNumber++;//not thread-safe
    }
}
