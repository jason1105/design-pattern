package com.lvw.designpattern.gof.behavior.chainOfResponsibility.core;

public abstract class InterceptorAbstract {

    InterceptorAbstract next;
    int level;

    InterceptorAbstract(int level) {
        this.level = level;
    }

    public void log(int level, String msg) {
        if (level == this.level) {
            write(msg);
        }
        if (next != null) {
            next.log(level, msg);
        }
    }

    public InterceptorAbstract setNext(InterceptorAbstract log) {
        this.next = log;
        return this;
    }

    abstract void write(String msg);
}
