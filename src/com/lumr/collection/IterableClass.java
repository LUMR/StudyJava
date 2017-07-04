package com.lumr.collection;

import java.util.Iterator;

/**
 * Created by lumr on 2017/7/4.
 */
public class IterableClass implements Iterable<String> {
    private String[] strings = new String[10];
    private int i = 0;

    public IterableClass(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            this.strings[i] = strings[i];
        }
        i = strings.length;
    }

    public int add(String str) {
        strings[i] = str;
        return i++;
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<String> {
        private int num = 0;

        @Override
        public boolean hasNext() {
            return num < IterableClass.this.i;
        }

        @Override
        public String next() {
            return IterableClass.this.strings[num++];
        }
    }

}
