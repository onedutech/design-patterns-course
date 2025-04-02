package com.onedutech.dp.structure.bridge;

public abstract class Abstraction {
    private Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void operationImpl1(String p) {
        implementation.operationImpl1(p);
    }

    public void operationImpl2(int p) {
        implementation.operationImpl2(p);
    }

    public abstract void operation();

}
