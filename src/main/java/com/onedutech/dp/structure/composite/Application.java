package com.onedutech.dp.structure.composite;

public class Application {

    public static void main(String[] args) {
        Composite racine = getTree();
        racine.operation();
    }

    private static Composite getTree() {
        Composite racine = new Composite("Composite 1");
        Composite composite2 = new Composite("Composite 2");
        racine.add(composite2);
        racine.add(new Element("Elément 11"));
        racine.add(new Element("Elément 12"));
        racine.add(new Element("Elément 13"));
        composite2.add(new Element("Elément 21"));
        composite2.add(new Element("Elément 22"));
        return racine;
    }
}

/*
composite1
--composite2
----element21
----element22
--element11
--element12
--element13
*/



