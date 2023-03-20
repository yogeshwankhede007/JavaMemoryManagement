package com.jvmAndMemoryManagement;

public class EqualsExample {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        System.out.println(p1 == p2 || p1.equals(p2));


    }


}
