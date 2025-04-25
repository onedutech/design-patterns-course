package com.onedutech.dp.creation.abstractfactory.example.button;

public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Creation MacOsButton.");
    }
}