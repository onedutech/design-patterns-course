package com.onedutech.dp.comportement.strategy.duck;

public class Colvert extends Canard {
    public Colvert() {
        comportementCancan = new Cancan();
        comportementVol = new VolerAvecDesAilles();
    }

    public void afficher() {
        System.out.println("Je suis un vrai Colvert");
    }
}
