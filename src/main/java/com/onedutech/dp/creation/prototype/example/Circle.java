package com.onedutech.dp.creation.prototype.example;

public class Circle extends Shape {
    private final int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }


    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == radius;
    }
}
