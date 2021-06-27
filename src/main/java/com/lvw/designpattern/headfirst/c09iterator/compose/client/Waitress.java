package com.lvw.designpattern.headfirst.c09iterator.compose.client;

import com.lvw.designpattern.headfirst.c09iterator.compose.frame.MenuComponent;
import com.lvw.designpattern.headfirst.c09iterator.compose.frame.MenuItem;

import java.util.Iterator;


public class Waitress {

    MenuComponent menus;

    public Waitress(MenuComponent menus) {
        this.menus = menus;
    }


    public void printMenu() {
        System.out.println("MENU");

        Iterator<MenuComponent> iterator = menus.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

    private void printMenu(Iterator<MenuItem> iterator) {
    }

    public void printBreakfastMenu() {

        System.out.println("MENU\n-------\nBREAKFAST");
    }

    public void printLunchMenu() {
        System.out.println("MENU\n-------\n");
        System.out.println("LUNCH");
    }

    public void printDinnerMenu() {
        System.out.println("MENU\n-------\n");
        System.out.println("DINNER");
    }


    public void printVegetarianMenu() {

    }


    public boolean isItemVegetarianItem(String name) {



        return false;
    }



}
