package com.lvw.designpattern.gof.bridge.tools.window_impl;

import com.lvw.designpattern.gof.bridge.tools.PixPoint;
import com.lvw.designpattern.gof.bridge.tools.Point;
import com.lvw.designpattern.gof.bridge.tools.WindowImpl;

// windows 平台的画图方法
public class WinWindowImpl implements WindowImpl {
    @Override
    public void drawLine(Point p0, Point p1) {
        System.out.printf("[WIN]Draw link from %s to %s \n", p0, p1);
    }

    @Override
    public void drawPixel(PixPoint p0) {
        System.out.printf("[WIN]Draw point %s \n", p0);
    }
}
