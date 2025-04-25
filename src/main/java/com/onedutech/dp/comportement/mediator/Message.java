package com.onedutech.dp.comportement.mediator;

public class Message {
    private String message;
    private String expediteur;
    private String destinataire;

    public Message() {
    }

    public Message(String message, String destinataire) {
        this.message = message;
        this.destinataire = destinataire;
    }

    @Override
    public String toString() {
        return "Message	[message=" + message + ",  expediteur=" + expediteur
                + ",  destinataire=" + destinataire + "]";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getExpediteur() {
        return expediteur;
    }

    public void setExpediteur(String expediteur) {
        this.expediteur = expediteur;
    }

    public String getDestinataire() {
        return destinataire;
    }

    public void setDestinataire(String destinataire) {
        this.destinataire = destinataire;
    }
}
