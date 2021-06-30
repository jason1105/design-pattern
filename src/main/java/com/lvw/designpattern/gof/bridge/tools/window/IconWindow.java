package com.lvw.designpattern.gof.bridge.tools.window;

import com.lvw.designpattern.gof.bridge.tools.PixPoint;
import com.lvw.designpattern.gof.bridge.tools.Window;

/**
 * 图标窗口, 是 {@link Window} 的具体子类
 */
public class IconWindow implements Window {

    public void drawPix(PixPoint p0) {
        getWindowImpl().drawPixel(p0);
    }
}
