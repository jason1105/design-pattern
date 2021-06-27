package com.lvw.designpattern.headfirst.c07adaptor.client;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdaptor implements Enumeration {

    Iterator iterator;

    public IteratorAdaptor(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
