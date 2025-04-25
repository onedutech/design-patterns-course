package com.onedutech.dp.comportement.command;

public class CommandeA implements Commande {
    private final Recepteur recepteur;

    public CommandeA(Recepteur recepteur) {
        this.recepteur = recepteur;
    }

    @Override
    public void executer() {
        recepteur.action1();
    }
}
