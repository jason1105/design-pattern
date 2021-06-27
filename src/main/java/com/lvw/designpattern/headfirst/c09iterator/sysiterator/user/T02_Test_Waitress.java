package com.lvw.designpattern.headfirst.c09iterator.sysiterator.user;

import com.lvw.designpattern.headfirst.c09iterator.sysiterator.client.Waitress;
import com.lvw.designpattern.headfirst.c09iterator.sysiterator.frame.CafeMenu;
import com.lvw.designpattern.headfirst.c09iterator.sysiterator.frame.DinerMenu;
import com.lvw.designpattern.headfirst.c09iterator.sysiterator.frame.PancakeHouseMenu;

public class T02_Test_Waitress {

    public static void main(String[] args) {

        Waitress waitress = new Waitress(new DinerMenu(), new PancakeHouseMenu(), new CafeMenu());

        waitress.printMenu();
        waitress.printVegetarianMenu();
        System.out.println("Is Vegetarian BLT vegetarian: " + waitress.isItemVegetarianItem("Vegetarian BLT"));
        System.out.println("Is Hotdog vegetarian: " + waitress.isItemVegetarianItem("Hotdog"));
        waitress.printBreakfastMenu();
    }
}
