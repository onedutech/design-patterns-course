package com.onedutech.dp.structure.bridge;

public class AbstractionA extends Abstraction {
    public AbstractionA(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void operation() {
        System.out.println("Méthode	operation de AbstractionA");
        operationImpl1("X");
        operationImpl2(5);
        operationImpl1("Y");
    }
}
