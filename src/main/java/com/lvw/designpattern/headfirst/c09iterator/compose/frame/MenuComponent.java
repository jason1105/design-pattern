package com.lvw.designpattern.headfirst.c09iterator.compose.frame;

import java.util.Iterator;

public abstract class MenuComponent {

    public abstract void print();
    public abstract String getName();
    public abstract String getDescription();
    public abstract double getPrice();
    public abstract boolean isVegetarian();
    public abstract MenuComponent getChild(int i);
    public abstract Iterator<MenuComponent> iterator();
    public abstract void add(MenuComponent menuComponent);

}
