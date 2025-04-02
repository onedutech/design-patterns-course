package com.onedutech.dp.structure.adapter;

public class ImplStandard implements Standard {
    @Override
    public void operation(int nb1, int nb2) {
        System.out.println("Standard, Résultat=" + nb1 * nb2);
    }
}