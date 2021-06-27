package com.lvw.designpattern.headfirst.c07adaptor.user;

import com.lvw.designpattern.headfirst.c07adaptor.client.IteratorAdaptor;

import java.util.ArrayList;
import java.util.Enumeration;

public class T03_TestIteratorAdapter {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>(); // Enumeration was unsupported by list.
        list.add("1");
        list.add("2");
        list.add("3");

        Enumeration enumeration = new IteratorAdaptor(list.iterator());

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
