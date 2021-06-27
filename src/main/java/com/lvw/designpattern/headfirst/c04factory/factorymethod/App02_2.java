package com.lvw.designpattern.headfirst.c04factory.factorymethod;

import com.lvw.designpattern.headfirst.c04factory.factorymethod.framework.Shop;

import java.util.Scanner;

/**
 * 工厂方法演示: 百货商店
 */
public class App02_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 创建一个百货商店
        Shop shop = new DepartmentShop();

        // 输入鸭子类型, 目前只持支 yellow
        while (scanner.hasNext()) {

            String type = scanner.nextLine();

            shop.showDuck(type);
        }
    }
}
