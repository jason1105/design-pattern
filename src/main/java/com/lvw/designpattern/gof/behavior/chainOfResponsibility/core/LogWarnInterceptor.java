package com.lvw.designpattern.gof.behavior.chainOfResponsibility.core;

public class LogWarnInterceptor extends InterceptorAbstract {

    public LogWarnInterceptor() {
        super(LogLevel.WARN);
    }

    @Override
    void write(String msg) {
        System.out.printf("[WARN] %s\n", msg);
    }
}
