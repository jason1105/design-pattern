package com.lvw.designpattern.gof.structure.composite.core;

public class Bread implements Article{

    int amount;

    double price;


    public Bread(int amount, double price) {
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
        System.out.printf("面包: 数量 %s, 单价 %f, \n", amount, calculate());
    }

    @Override
    public double calculate() {
        return price * amount;
    }
}
