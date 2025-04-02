package com.onedutech.dp.comportement.decorator.coffee;

import com.onedutech.dp.comportement.decorator.coffee.deco.Chocolat;
import com.onedutech.dp.comportement.decorator.coffee.deco.Noisette;
import com.onedutech.dp.comportement.decorator.coffee.deco.Vanille;
import com.onedutech.dp.comportement.decorator.coffee.produits.Boisson;
import com.onedutech.dp.comportement.decorator.coffee.produits.Latte;


public class Application {
    public static void main(String[] args) throws Exception {
        Boisson boisson;
        boisson = new Latte();
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("---------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("--------------");
        boisson = new Noisette(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());
        System.out.println("--------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("--------------");
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription());
        System.out.println(boisson.cout());

        System.out.println("*************");

        Boisson b = new Vanille(new Chocolat(new Noisette(new Chocolat(new Latte()))));
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}
