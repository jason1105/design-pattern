package com.lvw.designpattern.headfirst.c09iterator.compose.user;

import com.lvw.designpattern.headfirst.c09iterator.compose.client.Waitress;
import com.lvw.designpattern.headfirst.c09iterator.compose.frame.Menu;
import com.lvw.designpattern.headfirst.c09iterator.compose.frame.MenuComponent;
import com.lvw.designpattern.headfirst.c09iterator.compose.frame.MenuItem;

public class T03_Test_Waitress {

    public T03_Test_Waitress() {
        super();
    }

    public static void main(String[] args) {

        MenuComponent rootMenu = new Menu("ROOT MENU", "The Biggest menu.");
        MenuComponent breakfastMenu = new Menu("BREAKFAST", "For breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER", "For dinner");

        rootMenu.add(new MenuItem("Big bow noddle", "Vegetarian", true, 10));
        rootMenu.add(new MenuItem("Small bow noddle", "Vegetarian", true, 10));

        rootMenu.add(breakfastMenu);
        rootMenu.add(dinnerMenu);

        breakfastMenu.add(new MenuItem("Bread", "One bread one butter", true, 3));
        breakfastMenu.add(new MenuItem("Eggs", "Whole egg", false, 1));

        dinnerMenu.add(new MenuItem("Watermelon", "Whole", true, 8));

        Waitress waitress = new Waitress(rootMenu);
        waitress.printMenu();


    }
}
