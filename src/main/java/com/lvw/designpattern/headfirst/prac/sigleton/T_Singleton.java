package com.lvw.designpattern.headfirst.prac.sigleton;

public class T_Singleton {

    private static volatile T_Singleton instance;

    void foo() {

    }

    static T_Singleton getInstance() {

        if (instance == null) {
            synchronized (T_Singleton.class) {
                if (instance == null) {
                    instance = new T_Singleton();
                }
            }
        }

        return instance;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {

            new Thread(() -> {
                T_Singleton t = T_Singleton.getInstance();
                System.out.println("Hash: " + t.hashCode());
            }).start();
        }
    }
}
