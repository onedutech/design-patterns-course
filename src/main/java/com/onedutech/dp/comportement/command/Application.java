package com.onedutech.dp.comportement.command;

public class Application {
    public static void main(String[] args) {
        Recepteur rec = new Recepteur();
        CommandeA commandeA = new CommandeA(rec);
        CommandeB commandeB = new CommandeB(rec);

        Invoqueur invoqueur = new Invoqueur();
        invoqueur.addCommande("mondialRelay", commandeA);
        invoqueur.addCommande("laPoste", commandeB);

        invoqueur.invoquer("mondialRelay");
        invoqueur.invoquer("laPoste");
        invoqueur.invoquer("colisRelais");
    }
}
