package com.onedutech.dp.comportement.mediator;

public class CollegueB extends Collegue {
    public CollegueB(String name, Mediateur mediateur) {
        super(name, mediateur);
    }

    @Override
    public void envoyerMessage(Message m) {
        System.out.println("----------------------");
        System.out.println("Collègue nom=" + name + ", Envoi de message");
        m.setExpediteur(this.name);
        mediateur.transmettreMessage(m);
        System.out.println("----------------------");
    }

    @Override
    public void recevoirMessage(Message m) {
        System.out.println("----------------------");
        System.out.println("Collègue nom=" + name + ", Réception du message");
        System.out.println("From :" + m.getExpediteur());
        System.out.println("Contenu:" + m.getMessage());
        System.out.println("Traitement du message par ....." + this.name);
        System.out.println("-------------------");
    }
}
