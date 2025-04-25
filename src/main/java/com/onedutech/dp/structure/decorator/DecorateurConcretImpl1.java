package com.onedutech.dp.structure.decorator;

public class DecorateurConcretImpl1 extends DecorateurAbstrait {
    public DecorateurConcretImpl1(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public void operation() {
        System.out.println("Décorateur	1  :  avant,	je  je  fais  X");
        composantAbstrait.operation();
        System.out.println("Décorateur	1  :  après,	je  je  fais  Y");
    }
}
