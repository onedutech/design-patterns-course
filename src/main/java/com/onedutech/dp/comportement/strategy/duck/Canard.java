package com.onedutech.dp.comportement.strategy.duck;

public abstract class Canard {
    ComportementVol comportementVol;
    ComportementCancan comportementCancan;

    public void effectuerCancan() {
        comportementCancan.cancaner();
    }

    public void effectuerVol() {
        comportementVol.voler();
    }

    public void setComportementVol(ComportementVol compV) {
        this.comportementVol = compV;
    }

    public void setComportementCancan(ComportementCancan compC) {
        this.comportementCancan = compC;
    }

    public void nager() {
        System.out.println("Je nage en flottant");
    }

    public abstract void afficher();
}
