package com.lvw.designpattern.gof.behavior.chainOfResponsibility.core;

public class LogDebugInterceptor extends InterceptorAbstract {

    public LogDebugInterceptor() {
        super(LogLevel.DEBUG);
    }

    @Override
    void write(String msg) {
        System.out.printf("[DEBUG] %s\n", msg);
    }
}
