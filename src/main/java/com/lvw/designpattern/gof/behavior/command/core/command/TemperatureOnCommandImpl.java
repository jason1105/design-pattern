package com.lvw.designpattern.gof.behavior.command.core.command;

import com.lvw.designpattern.gof.behavior.command.core.receiver.AirConditioner;

/**
 * @author lv-wei
 */
public class TemperatureOnCommandImpl implements Command{
    AirConditioner airConditioner;

    public TemperatureOnCommandImpl(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void doAction() {
        airConditioner.turnOn();
    }
}
