package com.lvw.designpattern.headfirst.c08templatemethod;

import java.util.Scanner;

public class Coffee extends CaffeineAbstract {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }

    @Override
    void brew() {
        System.out.println("Brew coffee.");
    }

    @Override
    void addCondiment() {
        System.out.println("Add sugar and milk.");
    }

    @Override
    boolean customerWantCondiments() {

        System.out.println("Do you need condiments (Y/N):");
        Scanner scan = new Scanner(System.in);

        if (scan.hasNext()) {
            if (scan.nextLine().toLowerCase().equals("y")) {
                return true;
            } else {
                return false;
            }
        }

        return true;
    }
}
