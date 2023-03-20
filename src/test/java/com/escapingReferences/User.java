package com.escapingReferences;

import com.jvmAndMemoryManagement.Address;

public class User {
    private String name;
    private Address address;
    private SensetiveObject sensetiveObject;

    public User(String name, Address address, SensetiveObject sensetiveObject){
        this.name = name;
        this.address=address;
        this.sensetiveObject = sensetiveObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public SensetiveObject getSensetiveObject() {
        return sensetiveObject;
    }

    public void setSensetiveObject(SensetiveObject sensetiveObject) {
        this.sensetiveObject = sensetiveObject;
    }
    @Override
    public Object clone() throws  CloneNotSupportedException {
        User userClone = null;
        userClone = (User) super.clone();
        //overwrite all mutable
        userClone.sensetiveObject((SensetiveObject) sensetiveObject.clone());
        return userClone;
    }

    private void sensetiveObject(SensetiveObject clone) {
    }
}
