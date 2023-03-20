package com.valuesAndReferences;

import com.jvmAndMemoryManagement.Person;

public class ExampleString {
    public static void main(String[] args) {
        String name = "rolex";
        String dog = "panda";
        String cat = "mia";
        // String rabbit ="sas";
        String rabbit = new String("fom");

        Person p = new Person();
        p.setLovesJava(true);
        p.setYearOfBirth(1993);
        p.setName("rolex");

        System.out.println(name == rabbit);
        System.out.println(name== p.getName());
    }

}
