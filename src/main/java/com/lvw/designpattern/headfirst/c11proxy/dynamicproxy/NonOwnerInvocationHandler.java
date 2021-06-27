package com.lvw.designpattern.headfirst.c11proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if (method.getName().equals("setHotOrNotRating")) {
            return method.invoke(person, args);
        }
        else if (method.getName().startsWith("set")) {
            throw new IllegalAccessException("You can't set info of others.");
        } else {
            return method.invoke(person, args);
        }
    }
}
