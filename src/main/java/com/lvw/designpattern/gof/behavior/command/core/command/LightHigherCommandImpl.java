package com.lvw.designpattern.gof.behavior.command.core.command;

import com.lvw.designpattern.gof.behavior.command.core.receiver.Light;

/**
 * @author lv-wei
 */
public class LightHigherCommandImpl implements Command {
    Light light;

    public LightHigherCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
        light.turnHigh();
    }
}
