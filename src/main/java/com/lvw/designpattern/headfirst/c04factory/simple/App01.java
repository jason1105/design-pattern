package com.lvw.designpattern.headfirst.c04factory.simple;

import com.lvw.designpattern.headfirst.c01strategy.*;

import java.util.Scanner;

/**
 * 演示鸭子
 */
public class App01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Duck duck = null;

        while (scanner.hasNext()) {

            String name = scanner.nextLine();

            duck = SimpleFactory.createDuck(name);

            // 我们的业务代码, 假设500行
            duck.display();
            duck.performQuack();
            duck.performFly();
        }
    }

}
