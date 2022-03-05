package com.lvw.designpattern.gof.structure.bridge.tools;

import com.lvw.designpattern.gof.structure.bridge.runtime_context.Context;
import com.lvw.designpattern.gof.structure.bridge.runtime_context.OS;
import com.lvw.designpattern.gof.structure.bridge.tools.window_impl.GNUWindowImpl;
import com.lvw.designpattern.gof.structure.bridge.tools.window_impl.WinWindowImpl;

/**
 * <pre>
 * 本类是 bridge 模式中的主类型, 即窗口.
 * bridge 模式中, 主类型有两个维度:
 * 一个是类型 (也就是这里的 {@link Window})
 * 一个是实现方式 (也就是 {@link WindowImpl})
 * </pre>
 */
public interface Window {

    void drawWindow(Point p0, Point p1);

    default void drawRect(Point p0, Point p1){
        WindowImpl windowImpl = getWindowImpl();

        Point p01 = new Point(p0.getX(), p0.getY() + p1.getY());
        Point p11 = new Point(p1.getX(), p1.getY() - p1.getY());

        windowImpl.drawLine(p0, p01);
        windowImpl.drawLine(p01, p1);
        windowImpl.drawLine(p1, p11);
        windowImpl.drawLine(p11, p0);
    }

    default WindowImpl getWindowImpl() {

        // also can use factory
        if (Context.getOs() == OS.WIN) {
            return new WinWindowImpl();
        } else {
            return new GNUWindowImpl();
        }
    }
}
