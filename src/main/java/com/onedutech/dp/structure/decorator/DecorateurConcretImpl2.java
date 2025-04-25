package com.onedutech.dp.structure.decorator;

public class DecorateurConcretImpl2 extends DecorateurAbstrait {

    public DecorateurConcretImpl2(ComposantAbstrait composantAbstrait) {
        super(composantAbstrait);
    }

    @Override
    public void operation() {
        System.out.println("Décorateur	2  :  avant,	je  fais  A");
        composantAbstrait.operation();
        System.out.println("Décorateur	2  :  après,	je  fais  B");
    }
}
