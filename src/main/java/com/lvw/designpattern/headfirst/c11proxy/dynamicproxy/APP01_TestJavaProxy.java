package com.lvw.designpattern.headfirst.c11proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class APP01_TestJavaProxy {

    public static void main(String[] args) {

        APP01_TestJavaProxy test = new APP01_TestJavaProxy();

        Person mumu = new PersonImpl();
        mumu.setAge(11);
        mumu.setName("tutu");
        mumu.setHotOrNotRating(80);

        Person tutu = new PersonImpl();
        tutu.setAge(11);
        tutu.setName("tutu");
        tutu.setHotOrNotRating(80);

        Person ownerProxy;
        ownerProxy = test.getOwnerProxy(tutu);
        System.out.println(ownerProxy);
        ownerProxy.setAge(99);
        System.out.println(ownerProxy);
        try {
            ownerProxy.setHotOrNotRating(100);
        } catch (Exception e) {
            e.printStackTrace();
        }

        Person NonOwnerProxy = test.getNonOwnerProxy(mumu);
        System.out.println(NonOwnerProxy);
        try {
            NonOwnerProxy.setAge(99);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(NonOwnerProxy);
        NonOwnerProxy.setHotOrNotRating(100);
        System.out.println(NonOwnerProxy);



    }

    Person getOwnerProxy(Person person) {

        return getProxy(person, new OwnerInvocationHandler(person));
    }

    Person getNonOwnerProxy(Person person) {

        return getProxy(person, new NonOwnerInvocationHandler(person));
    }

    Person getProxy(Person person, InvocationHandler handler) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler);
    }
}
