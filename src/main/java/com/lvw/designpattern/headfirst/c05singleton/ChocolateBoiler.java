package com.lvw.designpattern.headfirst.c05singleton;

public class ChocolateBoiler {

    // volatile 作用: 防止指令重排
    // ⛔ 注意, 1.4 以前的版本(含1.4) 的JVM对volatile的实现会导致双重检查加锁失效.
    private static volatile ChocolateBoiler chocolateBoiler = null;
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {

        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }

        return chocolateBoiler;
    }

    public static void main(String[] args) {
        System.out.println("ChocolateBoiler.getInstance().isEmpty() = " + ChocolateBoiler.getInstance().isEmpty());
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
