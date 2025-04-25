package com.onedutech.dp.structure.decorator;

public class Application {
    public static void main(String[] args) {
        ComposantAbstrait composantAbstrait = new ComposantConcretImpl1();
        composantAbstrait.operation();
        System.out.println("--------------------");
        System.out.println("Première décoration");
        System.out.println("--------------------");
        composantAbstrait = new DecorateurConcretImpl1(composantAbstrait);
        composantAbstrait.operation();
        System.out.println("--------------------");
        System.out.println("Deuxième décoration");
        System.out.println("--------------------");
        composantAbstrait = new DecorateurConcretImpl2(composantAbstrait);
        composantAbstrait.operation();
    }
}
