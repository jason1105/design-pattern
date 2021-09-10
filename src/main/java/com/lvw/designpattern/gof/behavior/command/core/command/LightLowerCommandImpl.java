package com.lvw.designpattern.gof.behavior.command.core.command;

import com.lvw.designpattern.gof.behavior.command.core.receiver.Light;

/**
 * @author lv-wei
 */
public class LightLowerCommandImpl implements Command {
    Light light;

    public LightLowerCommandImpl(Light light) {
        this.light = light;
    }

    @Override
    public void doAction() {
        light.turnLower();
    }
}
