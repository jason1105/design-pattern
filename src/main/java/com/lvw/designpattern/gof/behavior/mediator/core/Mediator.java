package com.lvw.designpattern.gof.behavior.mediator.core;

/**
 * Take a role of registry.
 *
 * @author lv-wei
 */
public interface Mediator {
    void register(Colleague colleague);
    void relay(Colleague sender, String msg);

    void relay(Colleague sender, String msg, boolean skipSender);
}
