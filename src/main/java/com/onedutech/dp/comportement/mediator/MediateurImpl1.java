package com.onedutech.dp.comportement.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediateurImpl1 extends Mediateur {
    private final List<Message> conversations = new ArrayList<>();

    @Override
    public void transmettreMessage(Message m) {
        System.out.println("--------- Début Médiateur ----------");
        System.out.println("Enregistrement du message");
        conversations.add(m);
        System.out.println("Transmission du message");
        System.out.println("From :" + m.getExpediteur());
        System.out.println("To:" + m.getDestinataire());
        Collegue destinataire = collegues.get(m.getDestinataire());
        destinataire.recevoirMessage(m);
        System.out.println("--------- Fin Médiateur ----------");
    }

    public void analyserConversation() {
        for (Message m : conversations) System.out.println(m.toString());
    }
}
