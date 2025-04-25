package com.onedutech.dp.comportement.mediator;

public abstract class Collegue {
    protected String name;
    protected Mediateur mediateur;

    public Collegue(String name, Mediateur mediateur) {
        this.name = name;
        this.mediateur = mediateur;
        mediateur.addCollegue(name, this);
    }

    public abstract void envoyerMessage(Message m);

    public abstract void recevoirMessage(Message m);

}
