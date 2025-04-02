package com.onedutech.dp.structure.flyweight;

public class PoidsMoucheConcret implements PoidsMouche {
    private String valeur;

    public PoidsMoucheConcret(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public void afficher(String context) {
        System.out.println("Poids mouche avec la valeur " + valeur + ",context=" + context);
    }
}