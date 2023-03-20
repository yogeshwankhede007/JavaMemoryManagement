package com.escapingReferences;

public class SensetiveObject {
    private  int secretCode;

    public int getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(int secretCode) {
        this.secretCode = secretCode;
    }
    @Override
    public Object clone() throws  CloneNotSupportedException{
        return  super.clone();
    }
}
