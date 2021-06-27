package com.lvw.designpattern.headfirst.prac.observable;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

    List<Observer> observers = new ArrayList<>();

    void addObserver(Observer observer) {
        observers.add(observer);
    }

    boolean removeObserver(Observer observer) {
        return observers.remove(observer);
    }

    void broadcast(String msg) {

        for (int i = 0; i < observers.size(); i++) {
            Observer observer =  observers.get(i);
            observer.update(msg);
        }
    }


}
