package com.lvw.designpattern.gof.behavior.mediator.core;

public interface Colleague {
    void send(String msg);
    void receive(Colleague sender, String msg);
    void setMediator(Mediator mediator);
}
