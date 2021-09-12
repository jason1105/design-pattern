package com.lvw.designpattern.gof.behavior.mediator.core;

import java.util.ArrayList;

/**
 * @author lv-wei
 */
public class ConcreteMediatorImpl implements Mediator {

    private ArrayList<Colleague> colleagues = new ArrayList<>();
    ;

    @Override
    public void register(Colleague colleague) {
        colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public void relay(Colleague sender, String msg) {
        relay(sender, msg, true);
    }

    @Override
    public void relay(Colleague sender, String msg, boolean skipSender) {
        // colleagues.forEach(colleague -> {
        //     if (sender != colleague || (sender == colleague && !skipSender)) {
        //         colleague.receive(sender, msg);
        //     }
        // });

        colleagues.parallelStream().filter(colleague -> {
            if (skipSender) {
                return colleague != sender;
            } else {
                return true;
            }
        }).forEach(colleague -> colleague.receive(sender, msg));
    }
}
