package com.onedutech.dp.structure.adapter;

public class ImplAdaptee {
    public int operation2(int nb1, int nb2) {
        return (nb1 * nb2) + 10;
    }

    public void operation3(int nb) {
        System.out.println("Adaptée, Résultat=" + nb);
    }
}
