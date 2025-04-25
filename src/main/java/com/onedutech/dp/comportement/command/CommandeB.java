package com.onedutech.dp.comportement.command;

public class CommandeB implements Commande {
    private final Recepteur recepteur;

    public CommandeB(Recepteur recepteur) {
        this.recepteur = recepteur;
    }

    @Override
    public void executer() {
        recepteur.action2();
    }
}
