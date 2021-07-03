package com.lvw.designpattern.gof.structure.composite.core;

public class Cola implements Article {
    int amount;

    double price;


    public Cola(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }


    @Override
    public void add(Article article) {

    }

    @Override
    public void remove(Article article) {

    }

    @Override
    public void printArticle() {
        System.out.printf("可乐: 数量 %s, 单价 %f, \n", amount, calculate());
    }

    @Override
    public double calculate() {
        return price * amount;
    }
}
