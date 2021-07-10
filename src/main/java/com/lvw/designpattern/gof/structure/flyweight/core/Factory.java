package com.lvw.designpattern.gof.structure.flyweight.core;

import java.util.HashMap;
import java.util.Map;

public class Factory {

    static Map<String, Human> map = new HashMap<>();

    public static Human get(String kind) {
        return map.computeIfAbsent(kind, s -> new Male(s));
    }

    public static Map<String, Human> getFlyweights() {
        return map;
    }
}
