package com.lvw.designpattern.headfirst.c05singleton;

public class ChocolateBoiler2 {

    private boolean empty;
    private boolean boiled;

    public static ChocolateBoiler2 chocolateBoiler = new ChocolateBoiler2();

    private ChocolateBoiler2() {
        empty = true;
        boiled = false;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public static void main(String[] args) {
        System.out.println("ChocolateBoiler2.chocolateBoiler.isEmpty() = " + ChocolateBoiler2.chocolateBoiler.isEmpty());
    }
}
