package com.lvw.designpattern.headfirst.prac.observable;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addObserver(new Lee());

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            subject.setNew(scanner.nextLine());
        }


    }
}
