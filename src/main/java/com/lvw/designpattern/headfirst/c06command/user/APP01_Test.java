package com.lvw.designpattern.headfirst.c06command.user;

import com.lvw.designpattern.headfirst.c06command.client.XiaoMiControllerPanel;

/**
 * 命令模式的核心是 Command 接口. 以及相关的一组具体命令.
 */
public class APP01_Test {

    /**
     * 模拟最终用户使用遥控器.
     * @param args
     */
    public static void main(String[] args) {

        XiaoMiControllerPanel xiaoMiControllerPanel = new XiaoMiControllerPanel();
        xiaoMiControllerPanel.aButton(0);
        xiaoMiControllerPanel.bButton(0);

        xiaoMiControllerPanel.aButton(1);
        xiaoMiControllerPanel.bButton(1);
        xiaoMiControllerPanel.undoButton();


        /*ControllerPanel controllerPanel = new ControllerPanel();

        TV tv = new TV();
        Command tvOnCommand = new TVOnCommand(tv); // 构建一条具体的命令
        Command tvOffCommand = new TVOffCommand(tv); // 构建一条具体的命令
        controllerPanel.setSlot1Command(tvOnCommand, tvOffCommand); // 为执行者指定命令

        // 执行者执行命令
        controllerPanel.slot1A();
        controllerPanel.slot1B();

        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        controllerPanel.setSlot1Command(lightOnCommand, lightOffCommand);

        controllerPanel.slot1A();
        controllerPanel.slot1B();*/
    }
}
