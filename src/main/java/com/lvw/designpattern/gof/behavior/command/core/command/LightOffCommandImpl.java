package com.lvw.designpattern.gof.behavior.command.core.command;

import com.lvw.designpattern.gof.behavior.command.core.receiver.Light;

/**
 * @author lv-wei
 */
public class LightOffCommandImpl implements Command {
    Light light;

    public LightOffCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
        light.turnOff();
    }
}
