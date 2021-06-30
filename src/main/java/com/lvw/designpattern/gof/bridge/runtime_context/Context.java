package com.lvw.designpattern.gof.bridge.runtime_context;

public class Context {
    private static OS _os;

    public static OS getOs() {
        return _os;
    }

    public static void setOs(OS os) {
        _os = os;
    }
}
