package com.onedutech.dp.structure.flyweight;

public class Application {
    public static void main(String[] args) {
        FabriquePoidsMouche fabrique = new FabriquePoidsMouche();
        PoidsMouche pm = fabrique.getPoidsMouche("poids");
        PoidsMouche pmBis = fabrique.getPoidsMouche("poids");
        System.out.println("------------------");
        pm.afficher("Context1");
        pmBis.afficher("Context2");
        System.out.println(pm == pmBis);
        System.out.println("------------------");
        PoidsMouche pm2 = fabrique.getPoidsMouche("flyweight");
        PoidsMouche pm2Bis = fabrique.getPoidsMouche("flyweight");
        pm2.afficher("Context1");
        pm2Bis.afficher("Context2");
        System.out.println(pm2 == pm2Bis);
        System.out.println("------------------");
        PoidsMouche pm3 = fabrique.getPoidsMouche("A" , "B");
        PoidsMouche pm3Bis = fabrique.getPoidsMouche("A" , "B");
        pm3.afficher(null);
        pm3Bis.afficher(null);
        System.out.println(pm3 == pm3Bis);
        System.out.println("------------------");
    }
}