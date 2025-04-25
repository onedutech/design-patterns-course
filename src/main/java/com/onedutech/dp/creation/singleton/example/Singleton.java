package com.onedutech.dp.creation.singleton.example;

public class Singleton {

    private int compteur = 0;
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Creation du singleton");
    }

    public static Singleton getInstance() {
        return instance;
    }


    public synchronized void traiter(String tache) {
        System.out.println("----------  Tâche  " + tache + "----------");
        for (int i = 1; i <= 5; i++) {
            ++compteur;
            System.out.print("." + compteur);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Compteur=" + compteur);
    }

}
