package com.lvw.designpattern.gof.behavior.command.client;

import com.lvw.designpattern.gof.behavior.command.core.command.Command;
import com.lvw.designpattern.gof.behavior.command.core.command.LightHigherCommandImpl;
import com.lvw.designpattern.gof.behavior.command.core.receiver.Light;

/**
 * @author lv-wei
 */
public class ControlPanel {

    private Command lightOn;

    public void initPanel(Command lightOn) {
        this.lightOn = lightOn;
    }

    public void lightOnButtonOnClick() {
        lightOn.doAction();
    }

    public static void main(String[] args) {
        ControlPanel controlPanel = new ControlPanel();
        controlPanel.initPanel(new LightHigherCommandImpl(new Light()));
        controlPanel.lightOnButtonOnClick();
    }
}
