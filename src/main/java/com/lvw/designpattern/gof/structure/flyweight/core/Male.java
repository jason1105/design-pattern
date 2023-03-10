package com.lvw.designpattern.gof.structure.flyweight.core;

/**
 * Flyweight of concrete
 */
public class Male implements Human {

    // intrinsic ει¨ηΆζ
    String kind = null;

    public Male(String kind) {
        this.kind = kind;
    }

    @Override
    public void description(String name) {
        System.out.printf("My name is %s, I'm a %s\n", name, kind);
    }
}
