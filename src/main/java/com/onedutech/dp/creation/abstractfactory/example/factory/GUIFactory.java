package com.onedutech.dp.creation.abstractfactory.example.factory;

import com.onedutech.dp.creation.abstractfactory.example.button.Button;
import com.onedutech.dp.creation.abstractfactory.example.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();

    Checkbox createCheckbox();
}