package com.onedutech.dp.comportement.decorator.coffee.deco;


import com.onedutech.dp.comportement.decorator.coffee.produits.Boisson;

public class Vanille extends DecorateurBoisson {
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Au Vanille";
    }

    @Override
    public double cout() {
        return 2.6 + boisson.cout();
    }
}
