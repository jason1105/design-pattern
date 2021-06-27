package com.lvw.designpattern.headfirst.c10state.first;

public enum STATE {
    SOLD_OUT("糖果机已售罄"),
    NO_QUARTER("糖果机等待投币"),
    HAS_QUARTER("糖果机等待转糖果"),
    SOLD("糖果机准备输出糖果");

    String description;

    STATE(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}
