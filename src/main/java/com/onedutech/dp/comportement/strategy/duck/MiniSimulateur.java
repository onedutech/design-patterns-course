package com.onedutech.dp.comportement.strategy.duck;

public class MiniSimulateur {
    public static void main(String[] args) {
        Canard colvert = new Colvert();
        colvert.nager();
        colvert.afficher();
        colvert.effectuerVol();
        colvert.effectuerCancan();
        colvert.setComportementCancan(new CoinCoin());
        colvert.setComportementVol(new NePasVoler());
        colvert.effectuerCancan();
        colvert.effectuerVol();
    }
}