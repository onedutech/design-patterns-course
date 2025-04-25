package com.onedutech.dp.comportement.mediator;

public class Application {
    public static void main(String[] args) {
        Mediateur mediateur = new MediateurImpl1();
        Collegue c1 = new CollegueA("C1", mediateur);
        Collegue c2 = new CollegueA("C2", mediateur);
        Collegue c3 = new CollegueB("C3", mediateur);

        c1.envoyerMessage(new Message("je suis à 20 m", "C2"));
    }
}
