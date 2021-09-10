package com.lvw.designpattern.gof.behavior.command.core.receiver;

/**
 * @author lv-wei
 */
public class AirConditioner {
    private Status status;
    private int temperature = 26;

    public void turnOn() {
        if (status == Status.ON) {
            System.out.println("No need to turn on.");
        } else {
            System.out.println("Air conditioner is on.");
        }
    }

    public void turnOff() {
        if (status == Status.OFF) {
            System.out.println("No need to turn off.");
        } else {
            System.out.println("Air conditioner is off");
        }
    }

    public void upTemperature() {
        if (status == Status.OFF) {
            System.out.println("Please turn Air Conditioner on first.");
        } else {
            System.out.printf("Add temperature: ", temperature++);
        }
    }

    public void downTemperature() {
        if (status == Status.OFF) {
            System.out.println("Please turn AirConditioner on first.");
        } else {
            System.out.printf("Down temperature: ", temperature--);
        }
    }


    public enum Status {
        ON, OFF
    }

}
