package com.jvmAndMemoryManagement;

public class HeapAndStack {
    public static void main(String[] args) {
        // stack memory
        int x = 5;
        double y =3;
        boolean b = false;
        final int xy =3;
        //we ge StackOverFlowError

        // stack and heap
        Person p = new Person();
        Address a = new Address();

        // heap memory

        a.setCity("Mumbai");
        a.setCountry("india");
        a.setNumber("43");
        a.setStreetName("Mohamad Ali Road");
        a.setZipCode("400056");

        p.setLovesJava(true);
        p.setYearOfBirth(1994);
        p.setName("yogi");

        //connect address and person on heap
        p.setAddress(a);

        // we get OutOfMemoryEError
    }
}
