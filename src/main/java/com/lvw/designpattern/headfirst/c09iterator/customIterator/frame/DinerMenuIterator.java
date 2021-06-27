package com.lvw.designpattern.headfirst.c09iterator.customIterator.frame;

public class DinerMenuIterator implements Iterator<MenuItem> {

    MenuItem[] data;
    int next = 0;

    public DinerMenuIterator(MenuItem[] data) {
        this.data = data;
    }

    @Override
    public boolean hasNext() {
        return next < data.length;
    }

    @Override
    public MenuItem next() {
        return data[next++];
    }

}
