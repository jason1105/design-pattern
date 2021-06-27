package com.lvw.designpattern.headfirst.c11proxy.dynamicproxy;

public class PersonImpl implements Person {

    private String name;
    private int age;
    private int rating;
    private int ratingCount;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getHotOrNotRating() {
        return ratingCount == 0 ? rating : rating / ratingCount;
    }

    @Override
    public void setHotOrNotRating(int rating) {
        this.rating = this.rating + rating;
        this.ratingCount++;
    }

    @Override
    public String toString() {
        return "PersonImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                ", ratingCount=" + ratingCount +
                '}';
    }
}
