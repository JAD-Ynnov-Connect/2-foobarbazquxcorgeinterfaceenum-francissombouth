package com.jad;

public enum EBaz implements IBaz{
    BAZ1("Baz1"),
    BAZ2("Baz2"),
    BAZ3("Baz3");
    private final String name;
    EBaz(String name) {
        this.name = name;
    }
    public void doSomethingLikeABaz() {
    }
}