package com.lvw.designpattern.gof.behavior.chainOfResponsibility.core;

public class LogErrorInterceptor extends InterceptorAbstract {

    public LogErrorInterceptor() {
        super(LogLevel.ERROR);
    }

    @Override
    void write(String msg) {
        System.out.printf("[ERROR] %s\n", msg);
    }
}
