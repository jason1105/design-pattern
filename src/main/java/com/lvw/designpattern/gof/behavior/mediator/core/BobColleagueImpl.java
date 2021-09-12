package com.lvw.designpattern.gof.behavior.mediator.core;

public class BobColleagueImpl implements Colleague {
    Mediator mediator;

    public void doBusiness() {
        String msg1 = "Bob is man.";
        System.out.println("Bob send msg: " + msg1);
        send(msg1);
    }

    @Override
    public void send(String msg) {
        mediator.relay(this, msg);
    }

    @Override
    public void receive(Colleague sender, String msg) {
        System.out.println("Bob receive msg: " + msg);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
