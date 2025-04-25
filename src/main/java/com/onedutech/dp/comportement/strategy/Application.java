package com.onedutech.dp.comportement.strategy;

public class Application {
    public static void main(String[] args) {
        Context ctx = new Context();
        System.out.println("Stratégie 1:");
        ctx.effectuerOperation();
        ctx.setStrategy(new StrategyImpl1());
        ctx.effectuerOperation();
        System.out.println("Stratégie 2:");
        ctx.setStrategy(new StrategyImpl2());
        ctx.effectuerOperation();
        System.out.println("Stratégie 3:");
        ctx.setStrategy(new StrategyImpl3());
        ctx.effectuerOperation();
    }
}


