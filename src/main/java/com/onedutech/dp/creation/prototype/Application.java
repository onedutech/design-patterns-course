package com.onedutech.dp.creation.prototype;

public class Application {
    public static void main(String[] args) throws CloneNotSupportedException {
        Figure f1 = new Cercle(new Point(10, 10), new Point(20, 20));
        Figure f2 = new Rectangle(new Point(30, 30), new Point(40, 40));
        System.out.println("Surface de " + f1 + " est :" + f1.getSurface());
        System.out.println("Surface de " + f2 + " est :" + f2.getSurface());
        System.out.println("----------------------------------------------------------------");
        Figure f3 = f1.clone();
        System.out.println("Copie de f1 :");
        System.out.println("Surface de " + f3 + " est :" + f3.getSurface());
        System.out.println("----------------------------------------------------------------");
        Figure f4 = f2.clone();
        System.out.println("Copie de f2 :");
        System.out.println("Surface de " + f4 + " est :" + f4.getSurface());
    }
}
