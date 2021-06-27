package com.lvw.designpattern.headfirst.c09iterator.customIterator.frame;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

    java.util.Iterator<MenuItem> iterator;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        iterator = items.iterator();
    }

    @Override
    public boolean hasNext() {

        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }
}
