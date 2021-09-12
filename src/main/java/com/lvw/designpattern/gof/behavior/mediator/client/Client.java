package com.lvw.designpattern.gof.behavior.mediator.client;

import com.lvw.designpattern.gof.behavior.mediator.core.BobColleagueImpl;
import com.lvw.designpattern.gof.behavior.mediator.core.Colleague;
import com.lvw.designpattern.gof.behavior.mediator.core.ConcreteMediatorImpl;
import com.lvw.designpattern.gof.behavior.mediator.core.LeeColleagueImpl;
import com.lvw.designpattern.gof.behavior.mediator.core.Mediator;

public class Client {
    public static void main(String[] args) {
        BobColleagueImpl bob = new BobColleagueImpl();
        LeeColleagueImpl lee = new LeeColleagueImpl();

        Mediator mediator = new ConcreteMediatorImpl();

        mediator.register(bob);
        mediator.register(lee);

        bob.doBusiness();
        lee.doBusiness();


    }
}
