package com.onedutech.dp.structure.facade;

public class Facade {
    private final ClasseA a = new ClasseA();
    private final ClasseB b = new ClasseB();

    public void operation2() {
        System.out.println("Opération 2 de Facade :");
        a.operation2();
    }

    public void operation41() {
        System.out.println("Opération 41 de Facade :");
        b.operation4();
        a.operation1();
    }
}
