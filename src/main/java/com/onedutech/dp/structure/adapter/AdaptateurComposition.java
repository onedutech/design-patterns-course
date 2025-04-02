package com.onedutech.dp.structure.adapter;

public class AdaptateurComposition implements Standard {
    private ImplAdaptee adaptee = new ImplAdaptee();

    @Override
    public void operation(int nb1, int nb2) {
        int nb = adaptee.operation2(nb1, nb2);
        adaptee.operation3(nb);
    }
}
