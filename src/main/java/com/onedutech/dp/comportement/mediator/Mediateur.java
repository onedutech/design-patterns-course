package com.onedutech.dp.comportement.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class Mediateur {
    protected Map<String, Collegue> collegues = new HashMap<String, Collegue>();

    public abstract void transmettreMessage(Message m);

    public void addCollegue(String ref, Collegue a) {
        collegues.put(ref, a);
    }
}
