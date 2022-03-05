package com.lvw.designpattern.gof.structure.bridge.tools.window;

import com.lvw.designpattern.gof.structure.bridge.tools.Point;
import com.lvw.designpattern.gof.structure.bridge.tools.Window;
import com.lvw.designpattern.gof.structure.bridge.tools.WindowImpl;

/**
 * 应用程序窗口, 是 {@link Window} 的具体子类
 */
public class ApplicationWindow implements Window {

    @Override
    public void drawWindow(Point p0, Point p1) {
        // 绘制三重线条窗口
    }
}
