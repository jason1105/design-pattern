package com.lvw.designpattern.headfirst.c09iterator.sysiterator.client;

import com.lvw.designpattern.headfirst.c09iterator.sysiterator.frame.Menu;
import com.lvw.designpattern.headfirst.c09iterator.sysiterator.frame.MenuItem;

import java.util.Iterator;


public class Waitress {

    private Menu dinerMenu;
    private Menu pancakeHouseMenu;
    private Menu cafeMenu;

    public Waitress(Menu dinerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> menuItemIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("MENU\n-------\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("LUNCH");
        printMenu(menuItemIterator);
        System.out.println("DINNER");
        printMenu(cafeMenuIterator);

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void printBreakfastMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();

        System.out.println("MENU\n-------\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
    }

    public void printLunchMenu() {
        Iterator<MenuItem> menuItemIterator = dinerMenu.createIterator();
        System.out.println("MENU\n-------\n");
        System.out.println("LUNCH");
        printMenu(menuItemIterator);
    }

    public void printDinnerMenu() {
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();
        System.out.println("MENU\n-------\n");
        System.out.println("DINNER");
        printMenu(cafeMenuIterator);
    }


    public void printVegetarianMenu() {

        Iterator<MenuItem> menuItemIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();

        System.out.println("VEGETARIAN");

        printVegetarian(menuItemIterator);
        printVegetarian(pancakeHouseMenuIterator);
        printVegetarian(cafeMenuIterator);
    }

    private void printVegetarian(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem mi = iterator.next();
            if (mi.isVegetarian()) {
                System.out.println(mi);
            }
        }
    }

    public boolean isItemVegetarianItem(String name) {

        Iterator<MenuItem> menuItemIterator = dinerMenu.createIterator();
        Boolean mi = getaBoolean(name, menuItemIterator);
        if (mi != null) return mi;

        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();
        mi = getaBoolean(name, pancakeHouseMenuIterator);
        if (mi != null) return mi;

        Iterator<MenuItem> cafeMenuIterator = cafeMenu.createIterator();
        mi = getaBoolean(name, cafeMenuIterator);
        if (mi != null) return mi;

        return false;
    }

    private Boolean getaBoolean(String name, Iterator<MenuItem> menuItemIterator) {
        while (menuItemIterator.hasNext()) {
            MenuItem mi = menuItemIterator.next();

            if (mi.getName().equals(name)) {
                return mi.isVegetarian();
            }
        }
        return null;
    }
}
