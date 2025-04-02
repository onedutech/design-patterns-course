package com.onedutech.dp.comportement.decorator.coffee.deco;


import com.onedutech.dp.comportement.decorator.coffee.produits.Boisson;

public class Lait extends DecorateurBoisson {
    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au lait";
    }

    @Override
    public double cout() {
        return 2 + boisson.cout();
    }
}
