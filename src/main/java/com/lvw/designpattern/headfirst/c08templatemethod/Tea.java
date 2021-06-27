package com.lvw.designpattern.headfirst.c08templatemethod;

public class Tea extends CaffeineAbstract {

    public static void main(String[] args) {

        Tea tea = new Tea();
        tea.prepareRecipe();

    }

    @Override
    void brew() {
        System.out.println("Brew tea.");
    }

    @Override
    void addCondiment() {
        System.out.println("Add lemon.");
    }

}
