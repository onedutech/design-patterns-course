package com.onedutech.dp.creation.prototype.example;

import java.util.Objects;

public abstract class Shape implements Cloneable {
    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    protected String getColor() {
        return color;
    }


    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return Objects.equals(shape2.color, color);
    }

    @Override
    public Shape clone() {
        try {
            Shape clone = (Shape) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
