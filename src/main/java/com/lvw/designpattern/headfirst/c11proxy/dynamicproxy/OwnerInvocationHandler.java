package com.lvw.designpattern.headfirst.c11proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("setHotOrNotRating")) {
            throw new IllegalAccessException("你不能修改自己的排名.");
        } else {
            return method.invoke(person, args);
        }

    }
}
