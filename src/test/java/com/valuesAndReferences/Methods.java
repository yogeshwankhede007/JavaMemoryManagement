package com.valuesAndReferences;

public class Methods {
    public void method1(){
        int x = 0;
        method2(x);
    }

    private void method2( int x) {
            x=2;                //pass by value
        int y = 1;
        method3();
    }

    private void method3() {
        int z = 2;
    }
}
