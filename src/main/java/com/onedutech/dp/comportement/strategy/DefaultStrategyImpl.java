package com.onedutech.dp.comportement.strategy;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void operationStrategy() {
        System.out.println("===================================");
        System.out.println("=========== Default Strategy ============");
        System.out.println(":::::::::::::::::::::::::::::::::::");
    }
}
