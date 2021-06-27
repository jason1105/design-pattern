package com.lvw.designpattern.headfirst.c11proxy.dynamicproxy;

public interface Person {

    String getName();
    int getAge();
    int getHotOrNotRating();

    void setName(String name);
    void setAge(int age);
    void setHotOrNotRating(int rating);
}
