package com.onedutech.dp.structure.bridge;/* Application.java */


public class Application {
    public static void main(String[] args) {
        Implementation implA = new ImplementationA();
        Implementation implB = new ImplementationB();
        Abstraction absAA = new AbstractionA(implA);
        Abstraction absAB = new AbstractionA(implB);
        Abstraction absBA = new AbstractionB(implA);
        Abstraction absBB = new AbstractionB(implB);
        System.out.println("---------------------");
        absAA.operation();
        System.out.println("---------------------");
        absAB.operation();
        System.out.println("---------------------");
        absBA.operation();
        System.out.println("---------------------");
        absBB.operation();

    }
}

