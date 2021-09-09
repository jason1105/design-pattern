package com.lvw.designpattern.gof.behavior.chainOfResponsibility.client;

import com.lvw.designpattern.gof.behavior.chainOfResponsibility.core.InterceptorAbstract;
import com.lvw.designpattern.gof.behavior.chainOfResponsibility.core.LogDebugInterceptor;
import com.lvw.designpattern.gof.behavior.chainOfResponsibility.core.LogErrorInterceptor;
import com.lvw.designpattern.gof.behavior.chainOfResponsibility.core.LogLevel;
import com.lvw.designpattern.gof.behavior.chainOfResponsibility.core.LogWarnInterceptor;

public class Client {
    public static void main(String[] args) {
        InterceptorAbstract logDebugInterceptor = new LogDebugInterceptor().setNext(new LogWarnInterceptor().setNext(new LogErrorInterceptor()));

        logDebugInterceptor.log(LogLevel.DEBUG, "hello world");
        logDebugInterceptor.log(LogLevel.ERROR, "hello world");
    }
}
