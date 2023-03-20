package com.valuesAndReferences;

import java.util.List;

public class NotReallyImmutableExample {
    private final int x;
    private final String y;
    private final List<Integer> list; //this won't be immuatable

    public NotReallyImmutableExample(int x, String y, List<Integer> list) {
        this.x = x;
        this.y = y;
        this.list = list;
    }
}
