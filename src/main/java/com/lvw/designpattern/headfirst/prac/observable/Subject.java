package com.lvw.designpattern.headfirst.prac.observable;

public class Subject extends Observable {

    void setNew(String msg) {
        broadcast(msg);
    }

}
