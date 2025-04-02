package com.onedutech.dp.structure.flyweight;

public class PoidsMoucheNonPartage implements PoidsMouche {
    private String valeur1;
    private String valeur2;

    public PoidsMoucheNonPartage(String valeur1, String valeur2) {
        this.valeur1 = valeur1;
        this.valeur2 = valeur2;
    }

    @Override
    public void afficher(String context) {
        System.out.println("Poids mouche avec valeut1=" + valeur1 + " , valeur2 = "+valeur2);
    }
}