package com.onedutech.dp.creation.abstractfactory.example;

import com.onedutech.dp.creation.abstractfactory.example.button.Button;
import com.onedutech.dp.creation.abstractfactory.example.checkbox.Checkbox;
import com.onedutech.dp.creation.abstractfactory.example.factory.GUIFactory;

public class Application {
    Button button;
    Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paintApp() {
        button.paint();
        checkbox.paint();
    }
}
