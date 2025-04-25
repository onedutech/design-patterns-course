package com.onedutech.dp.structure.proxy;

public class Application {
    public static void main(String[] args) {
        Abstraction service = new Proxy();
        service.operation();
    }
}
