package com.lvw.designpattern.headfirst.c09iterator.compose.frame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Menu extends MenuComponent {

    private List<MenuComponent> menuitems = new ArrayList<>();
    private String name;
    private String description;
    private Stack stack = new Stack();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        throw new UnsupportedOperationException("菜单没有价格, 请选择具体菜品.");
    }

    @Override
    public boolean isVegetarian() {
        throw new UnsupportedOperationException("请选择具体菜品.");
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuitems.get(i);
    }

    @Override
    public Iterator<MenuComponent> iterator() {
        return new MenuIterator(menuitems.iterator());
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuitems.add(menuComponent);
    }
}
