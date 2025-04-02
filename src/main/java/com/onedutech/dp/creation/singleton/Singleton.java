package com.onedutech.dp.creation.singleton;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private int compteur;

    private Singleton() {
        System.out.println("Instanciation");
    }

    public static Singleton getInstance() {
        return instance;
    }

    public void traiter(String tache) {
        System.out.println("----------  Tâche  " + tache + "----------");
        for (int i = 1; i <= 5; i++) {
            ++compteur;
            System.out.print("." + compteur);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Compteur=" + compteur);
    }
}
