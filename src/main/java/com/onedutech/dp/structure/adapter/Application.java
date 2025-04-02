package com.onedutech.dp.structure.adapter;

public class Application {
    public static void main(String[] args) {
        Standard standard = new ImplStandard();
        standard.operation(7, 9);
        Standard adaptee1 = new AdaptateurHeritage();
        adaptee1.operation(7, 9);
        Standard adaptee2 = new AdaptateurComposition();
        adaptee2.operation(7, 9);
    }
}
