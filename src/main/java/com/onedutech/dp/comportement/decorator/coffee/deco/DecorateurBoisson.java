package com.onedutech.dp.comportement.decorator.coffee.deco;


import com.onedutech.dp.comportement.decorator.coffee.produits.Boisson;

public abstract class DecorateurBoisson extends Boisson {
    protected Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }
}
