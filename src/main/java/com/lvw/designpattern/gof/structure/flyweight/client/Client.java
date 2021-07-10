package com.lvw.designpattern.gof.structure.flyweight.client;

import com.lvw.designpattern.gof.structure.flyweight.core.Factory;
import com.lvw.designpattern.gof.structure.flyweight.core.Human;

public class Client {

    public static void main(String[] args) {

        // get object from factory
        Human student = Factory.get("student");
        student.description("Lee");
        student.description("Bruce");
        student.description("Lucy");

        // get object from factory
        Human employer = Factory.get("employer");
        employer.description("Johnson");
        employer.description("Mike");

        System.out.println(Factory.getFlyweights());
    }
}
/* -- output -- describe five  name is Bruce, I'm a student
My name is Lucy, I'm a studentpersons by only using two objects.
My name is Lee, I'm a student
My
My name is Johnson, I'm a employer
My name is Mike, I'm a employer
{student=com.lvw.designpattern.gof.structure.flyweight.core.Male@27d6c5e0, employer=com.lvw.designpattern.gof.structure.flyweight.core.Male@4f3f5b24}
*/