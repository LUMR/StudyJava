package com.lumr.collection;

import java.util.Arrays;

/**
 * Created by lumr on 2017/7/4.
 */
public class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("to be or not to be".split(" ")));
        for (String s :ral)
            System.out.print(s+" ");
        for (String s :ral.reversed())
            System.out.print(s+" ");
    }
}
