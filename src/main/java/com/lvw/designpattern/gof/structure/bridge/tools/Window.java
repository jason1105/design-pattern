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

    default WindowImpl getWindowImpl() {

        // also can use factory
        if (Context.getOs() == OS.WIN) {
            return new WinWindowImpl();
        } else {
            return new GNUWindowImpl();
        }
    }
}
