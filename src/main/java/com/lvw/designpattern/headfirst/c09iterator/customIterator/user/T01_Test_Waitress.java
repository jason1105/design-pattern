package com.lvw.designpattern.headfirst.c09iterator.customIterator.user;

import com.lvw.designpattern.headfirst.c09iterator.customIterator.client.Waitress;
import com.lvw.designpattern.headfirst.c09iterator.customIterator.frame.DinerMenu;
import com.lvw.designpattern.headfirst.c09iterator.customIterator.frame.PancakeHouseMenu;

public class T01_Test_Waitress {

    public static void main(String[] args) {

        Waitress waitress = new Waitress(new DinerMenu(), new PancakeHouseMenu());

        waitress.printMenu();
    }
}
