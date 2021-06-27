package com.lvw.designpattern.headfirst.c07adaptor.user;

import com.lvw.designpattern.headfirst.c07adaptor.client.EnumerationAdapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class T03_TestEnumerationAdapter {

    public static void main(String[] args) {

        Vector<Object> vector = new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");

        ArrayList<Object> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator enumerationAdapter = new EnumerationAdapter(vector.elements());


        while (enumerationAdapter.hasNext()) {
            System.out.println(enumerationAdapter.next());

            // unsupported
            /*
            enumerationAdapter.remove();
            enumerationAdapter.forEachRemaining(o -> {
                System.out.println(o);
            });
            */
        }



    }
}
