package com.lvw.designpattern.headfirst.prac.observable;

public class Lee implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("今天新闻是 " + msg);
    }
}
