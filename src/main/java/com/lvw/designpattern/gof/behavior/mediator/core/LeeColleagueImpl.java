package com.lvw.designpattern.gof.behavior.mediator.core;

public class LeeColleagueImpl implements Colleague {
    Mediator mediator;

    public void doBusiness() {
        String msg1 = "Lee is girl.";
        System.out.println("Lee send msg: " + msg1);
        send(msg1);
    }

    @Override
    public void send(String msg) {
        mediator.relay(this, msg);
    }

    @Override
    public void receive(Colleague sender, String msg) {
        System.out.println("Lee receive msg: " + msg);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
