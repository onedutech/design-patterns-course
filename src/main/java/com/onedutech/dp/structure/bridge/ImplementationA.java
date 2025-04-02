package com.onedutech.dp.structure.bridge;

public class ImplementationA implements Implementation {
    @Override
    public void operationImpl1(String p) {
        System.out.println("operationImpl1 de ImplementationA :" + p);
    }

    @Override
    public void operationImpl2(int p) {
        System.out.println("operationImpl2 de ImplementationA :" + p);
    }
}
