package com.lvw.designpattern.gof.bridge.tools;

// 定义主类型使用的方法, 这里指的是窗口用到的各种绘图方法
public interface WindowImpl {

    void drawLine(Point p0, Point p1);

    void drawPixel(PixPoint p0);
}
