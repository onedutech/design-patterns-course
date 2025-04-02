package com.onedutech.dp.comportement.decorator.coffee.produits;


public class Latte extends Boisson {

    public Latte() {
        this.description = "Cappuccino";
    }

    @Override
    public double cout() {
        return 16.5;
    }
}
