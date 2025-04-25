package com.onedutech.dp.creation.abstractfactory.example.button;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Creation WindowsButton.");
    }
}