package com.lumr.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by lumr on 2017/7/4.
 */
public class ReversibleArrayList<T> extends ArrayList<T> {
    public ReversibleArrayList(Collection<? extends T> c) {
        super(c);
    }

    public Iterable<T> reversed(){
        return () -> new Iterator<T>() {
            private int current = size()-1;
            @Override
            public boolean hasNext() {
                return current>-1;
            }

            @Override
            public T next() {
                return get(current--);
            }
        };
    }
}
