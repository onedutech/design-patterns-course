package com.onedutech.dp.creation.abstractfactory.example.factory;

import com.onedutech.dp.creation.abstractfactory.example.button.Button;
import com.onedutech.dp.creation.abstractfactory.example.button.MacOsButton;
import com.onedutech.dp.creation.abstractfactory.example.checkbox.Checkbox;
import com.onedutech.dp.creation.abstractfactory.example.checkbox.MacOSCheckbox;

public class MacOsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}