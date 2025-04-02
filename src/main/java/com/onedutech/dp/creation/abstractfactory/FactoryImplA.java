package com.onedutech.dp.creation.abstractfactory;

public class FactoryImplA implements AbstractFactory {
@Override
public	AbstractPlugin getInstence()	{ 
		return  new PluginImplA();
 }
}
