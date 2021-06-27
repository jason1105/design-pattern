package com.lvw.designpattern.headfirst.c06command.frame;

/**
 * 定义有两个slot的遥控器
 */
public class ControllerPanel {

    private static volatile ControllerPanel CONTROLLER_PANEL;

    Command[] aButton;
    Command[] bButton;

    Command lastCommand;

    public ControllerPanel() {
        aButton = new Command[7];
        bButton = new Command[7];

        Command noCmd = new NoCommand();
        for (int i = 0; i < aButton.length; i++) {
            aButton[i] = noCmd;
            bButton[i] = noCmd;
        }

    }

    public static ControllerPanel getInstance() {
        if (CONTROLLER_PANEL == null) {
            synchronized (ControllerPanel.class) {
                if (CONTROLLER_PANEL == null) {
                    CONTROLLER_PANEL = new ControllerPanel();
                    TV tv = new TV();
                    Command opentv = new TVOnCommand(tv); // 构建一条具体的命令
                    Command offtv = new TVOffCommand(tv); // 构建一条具体的命令
                    CONTROLLER_PANEL.setCommand(0, opentv, offtv);
                }
            }
        }
        return CONTROLLER_PANEL;
    }

    public void setCommand(int slot, Command a, Command b) {
        aButton[slot] = a;
        bButton[slot] = b;
    }


    public void aButton(int slot) {
        aButton[slot].execute();
        lastCommand = aButton[slot];
    }

    public void bButton(int slot) {
        bButton[slot].execute();
        lastCommand = bButton[slot];
    }

    public void undoButton() {
        lastCommand.undo();
    }
}
