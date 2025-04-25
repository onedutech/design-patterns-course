package com.onedutech.dp.creation.abstractfactory.example.factory;

import com.onedutech.dp.creation.abstractfactory.example.button.Button;
import com.onedutech.dp.creation.abstractfactory.example.button.WindowsButton;
import com.onedutech.dp.creation.abstractfactory.example.checkbox.Checkbox;
import com.onedutech.dp.creation.abstractfactory.example.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {

        return new WindowsButton();

    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}