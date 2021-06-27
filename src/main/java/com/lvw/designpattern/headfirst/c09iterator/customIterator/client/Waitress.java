package com.lvw.designpattern.headfirst.c09iterator.customIterator.client;

import com.lvw.designpattern.headfirst.c09iterator.customIterator.frame.*;


public class Waitress {

    private Menu dinerMenu;
    private Menu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> menuItemIterator = dinerMenu.createIterator();
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();

        System.out.println("MENU\n-------\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("LUNCH");
        printMenu(menuItemIterator);

    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    void printBreakfastMenu() {
        Iterator<MenuItem> pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();

        System.out.println("MENU\n-------\nBREAKFAST");
        printMenu(pancakeHouseMenuIterator);
    }

    void printLunchMenu() {
        Iterator<MenuItem> menuItemIterator = dinerMenu.createIterator();
        System.out.println("MENU\n-------\n");
        System.out.println("LUNCH");
        printMenu(menuItemIterator);
    }

    void printVegetarianMenu() {

    }

    boolean isItemVegetarianItem(String name) {

        return false;
    }
}
