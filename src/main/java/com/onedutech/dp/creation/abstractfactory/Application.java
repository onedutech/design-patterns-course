package com.onedutech.dp.creation.abstractfactory;

public class Application {
    public static void main(String[] args) throws Exception {
        // Instanciation statique de la fabrique
        AbstractFactory factory = new FactoryImplA();
        AbstractPlugin plugin = factory.getInstence();
        plugin.traitement();
        // Instanciation dynamique de la fabrique
        factory = (AbstractFactory) Class.forName("com.onedutech.dp.creation.abstractfactory.FactoryImplB")
                .getDeclaredConstructor().newInstance();
        plugin = factory.getInstence();
        plugin.traitement();
    }
}
