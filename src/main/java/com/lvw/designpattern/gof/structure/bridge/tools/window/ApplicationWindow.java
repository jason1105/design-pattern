package com.lvw.designpattern.gof.structure.bridge.tools.window;

import com.lvw.designpattern.gof.structure.bridge.tools.Point;
import com.lvw.designpattern.gof.structure.bridge.tools.Window;

/**
 * 应用程序窗口, 是 {@link Window} 的具体子类
 */
public class ApplicationWindow implements Window {

    public void drawRect(Point p0, Point p1) {
        getWindowImpl().drawLine(p0, p1);
    }
}
