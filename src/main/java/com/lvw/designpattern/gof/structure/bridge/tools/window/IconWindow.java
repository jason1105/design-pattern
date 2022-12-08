package com.lvw.designpattern.gof.structure.bridge.tools.window;

import com.lvw.designpattern.gof.structure.bridge.tools.Point;
import com.lvw.designpattern.gof.structure.bridge.tools.Window;

/**
 * 图标窗口, 是 {@link Window} 的具体子类
 */
public class IconWindow implements Window {

    @Override
    public void drawWindow(Point p0, Point p1) {
        // 绘制没有边线的窗口
    }

    public void drawPix(Point p) {
        
    }
}
