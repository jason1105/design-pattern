package com.lvw.designpattern.headfirst.c06command.client;

import com.lvw.designpattern.headfirst.c06command.frame.*;

/**
 * 客户根据需要构建自己的遥控器
 */
public class XiaoMiControllerPanel extends ControllerPanel {

    public XiaoMiControllerPanel() {
        super();

        TV tv = new TV();
        Command tvOnCommand = new TVOnCommand(tv); // 开电视
        Command tvOffCommand = new TVOffCommand(tv); // 关电视
        super.setCommand(0, tvOnCommand, tvOffCommand); // slot 1


        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);  // 开灯
        LightOffCommand lightOffCommand = new LightOffCommand(light);  // 关灯
        super.setCommand(1, lightOnCommand, lightOffCommand); // slot 2

    }


}
