package com.onedutech.dp.creation.abstractfactory.example;

import com.onedutech.dp.creation.abstractfactory.example.factory.GUIFactory;
import com.onedutech.dp.creation.abstractfactory.example.factory.MacOsFactory;
import com.onedutech.dp.creation.abstractfactory.example.factory.WindowsFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;
        if (osName.contains("mac")) {
            factory = new MacOsFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application application = new Application(factory);
        application.paintApp();
    }
}
