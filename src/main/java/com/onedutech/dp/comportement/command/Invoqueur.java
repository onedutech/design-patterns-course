package com.onedutech.dp.comportement.command;

import java.util.HashMap;
import java.util.Map;

public class Invoqueur {
    private final Map<String, Commande> commades = new HashMap<>();

    public void addCommande(String cmdName, Commande cmd) {
        commades.put(cmdName, cmd);
    }

    public void invoquer(String cmdName) {
        Commande cmd = commades.get(cmdName);
        if (cmd != null) cmd.executer();
    }
}
