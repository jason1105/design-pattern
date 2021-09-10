package com.lvw.designpattern.gof.behavior.command.core.command;

import com.lvw.designpattern.gof.behavior.command.core.receiver.AirConditioner;

/**
 * @author lv-wei
 */
public class TemperatureUpCommandImpl implements Command{
    AirConditioner airConditioner;

    public TemperatureUpCommandImpl(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void doAction() {
        airConditioner.upTemperature();
    }
}
