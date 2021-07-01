package com.lvw.designpattern.gof.structure.bridge.client;

import com.lvw.designpattern.gof.structure.bridge.tools.window.ApplicationWindow;
import com.lvw.designpattern.gof.structure.bridge.tools.window.IconWindow;
import com.lvw.designpattern.gof.structure.bridge.tools.PixPoint;
import com.lvw.designpattern.gof.structure.bridge.tools.Point;
import com.lvw.designpattern.gof.structure.bridge.runtime_context.Context;
import com.lvw.designpattern.gof.structure.bridge.runtime_context.OS;

public class Client {
    public static void main(String[] args) {

        Point p0 = new Point(1, 10);
        Point p1 = new Point(201, 210);

        // 两个窗口
        ApplicationWindow window = new ApplicationWindow();
        IconWindow icon = new IconWindow();

        // GNU 下绘图
        Context.setOs(OS.GNU); // 模拟操作系统平台
        window.drawRect(p0, p1);
        icon.drawPix(new PixPoint(1, 2, 1));

        // windows 下绘图
        Context.setOs(OS.WIN); // 模拟操作系统平台
        window.drawRect(p0, p1);
        icon.drawPix(new PixPoint(1, 2, 1));



    }
}
