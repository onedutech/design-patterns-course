package com.onedutech.dp.comportement.strategy.duck;

public class CanardEnPlastique extends Canard {
    public CanardEnPlastique() {
        comportementCancan = new CancanMuet();
        comportementVol = new NePasVoler();
    }

    public void afficher() {
        System.out.println("Je suis un canard en plastique");
    }
}
