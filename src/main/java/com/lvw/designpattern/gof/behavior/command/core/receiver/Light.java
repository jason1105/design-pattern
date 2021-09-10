package com.lvw.designpattern.gof.behavior.command.core.receiver;

/**
 * @author lv-wei
 */
public class Light {

    Status status;

    public void turnHigh() {
        if (status == Status.HIGH) {
            noWay();
        } else {
            status  = Status.HIGH;
            done();
        }
    }

    public void turnOff() {
        if (status == Status.CLOSE) {
            noWay();
        } else {
            status  = Status.CLOSE;
            done();
        }
    }

    public void turnLower() {
        if (status == Status.LOW) {
            noWay();
        } else {
            status  = Status.LOW;
            done();
        }
    }

    private void done() {
        System.out.printf("Turn to %s", status);
    }

    private void noWay() {
        System.out.printf("Can't do it.\n");
    }

    public enum Status {
        LOW,
        HIGH,
        CLOSE
    }
}
