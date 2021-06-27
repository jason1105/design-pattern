package com.lvw.designpattern.headfirst.c03decorator.inputstream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class APP01_TsetUpperInputStream {

    public static void main(String[] args) throws IOException {

        String s = "hello world!@#$%^&*()你好";

        UpperInputStream is = new UpperInputStream(new ByteArrayInputStream(s.getBytes()));
        byte[] bytes = new byte[128];
        is.read(bytes, 0, 128);

        String r = new String(bytes);
        System.out.println(r);
    }
}
