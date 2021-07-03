package com.lvw.designpattern.gof.structure.composite.client;

import com.lvw.designpattern.gof.structure.composite.core.Apple;
import com.lvw.designpattern.gof.structure.composite.core.Bag;
import com.lvw.designpattern.gof.structure.composite.core.Bread;
import com.lvw.designpattern.gof.structure.composite.core.Cola;

public class Client {

    public static void main(String[] args) {

        Apple apple = new Apple(4, 1.2);
        Bread bread = new Bread(1, 7.8);
        Cola cola = new Cola(1, 3.0);

        Bag bag = new Bag();
        bag.add(apple);

        Bag bag1 = new Bag();
        bag1.add(bag);
        bag1.add(cola);
        bag1.add(bread);

        bag1.printArticle();

        System.out.printf("小计: %f \n", bag1.calculate());
    }
}
