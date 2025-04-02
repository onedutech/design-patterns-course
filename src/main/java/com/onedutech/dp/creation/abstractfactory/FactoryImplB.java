package com.onedutech.dp.creation.abstractfactory;

public class FactoryImplB implements AbstractFactory {
    @Override
    public AbstractPlugin getInstence() {
        return new PluginImplB();
    }
}
