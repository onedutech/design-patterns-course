package com.onedutech.dp.structure.bridge;

public class AbstractionB extends Abstraction {

    public AbstractionB(Implementation implementation) {
        super(implementation);
    }

    @Override
    public void operation() {
        System.out.println("Méthode	operation de AbstractionB");
        operationImpl2(9);
        operationImpl2(4);
        operationImpl1("Z");
    }
}
