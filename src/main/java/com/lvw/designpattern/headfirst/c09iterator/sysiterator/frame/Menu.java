package com.lvw.designpattern.headfirst.c09iterator.sysiterator.frame;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
