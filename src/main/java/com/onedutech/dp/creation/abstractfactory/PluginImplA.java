package com.onedutech.dp.creation.abstractfactory;

public class PluginImplA implements AbstractPlugin {
    @Override
    public void traitement() {
        System.out.println("Traitement par le plugin A .....");
    }
}
