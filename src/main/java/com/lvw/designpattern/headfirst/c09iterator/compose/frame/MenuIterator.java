package com.lvw.designpattern.headfirst.c09iterator.compose.frame;

import java.util.Iterator;
import java.util.Stack;

public class MenuIterator implements Iterator<MenuComponent> {

    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public MenuIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {

        if (stack.isEmpty()) {
            return false;
        }

        Iterator<MenuComponent> iterator = stack.peek();
        boolean next = iterator.hasNext();

        if (!next) {
            stack.pop();
            return hasNext();
        }

        return true;
    }

    @Override
    public MenuComponent next() {

        Iterator<MenuComponent> iterator = stack.peek();

        if (iterator.hasNext()) {

            MenuComponent mc = iterator.next();

            if (mc instanceof Menu) {
                stack.push(mc.iterator());
            }

            return mc;
        }

        return null;
    }
}
