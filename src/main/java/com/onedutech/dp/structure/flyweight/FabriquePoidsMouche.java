package com.onedutech.dp.structure.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabriquePoidsMouche {

    private Map<String, PoidsMouche> poidsMouchesPartages = new HashMap<String, PoidsMouche>();

    public FabriquePoidsMouche() {
        poidsMouchesPartages.put("je" , new PoidsMoucheConcret("je"));
        poidsMouchesPartages.put("suis" , new PoidsMoucheConcret("suis"));
        poidsMouchesPartages.put("poids" , new PoidsMoucheConcret("poids"));
        poidsMouchesPartages.put("mouche" , new PoidsMoucheConcret("mouche"));
    }

    public PoidsMouche getPoidsMouche(String val) {
        PoidsMouche pm = poidsMouchesPartages.get(val);
        if (pm == null) {
            pm = new PoidsMoucheConcret(val);
            poidsMouchesPartages.put(val, pm);
        }
        return pm;
    }

    public PoidsMouche getPoidsMouche(String val1, String val2) {
        return new PoidsMoucheNonPartage(val1, val2);
    }
}

