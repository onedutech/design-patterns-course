package com.onedutech.dp.creation.prototype.example;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(15, "red");
        Shape cloneCircle = circle.clone();

        Shape rectangle = new Rectangle(10, 20, "blue");
        Shape clonedRectangle = rectangle.clone();

        System.out.println(circle.equals(cloneCircle));
        System.out.println(rectangle.equals(clonedRectangle));


    }
}
