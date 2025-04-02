package com.onedutech.dp.comportement.decorator.coffee.produits;


public class Deca extends Boisson {

    public Deca() {
        this.description = "Deca";
    }

    @Override
    public double cout() {
        return 11.5;
    }
}
