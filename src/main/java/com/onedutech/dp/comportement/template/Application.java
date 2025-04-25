package com.onedutech.dp.comportement.template;

public class Application {
    public static void main(String[] args) {
        TemplateClass template = new Implementation1();

        System.out.println(template.operationTemplate());

        template = new Implementation2();
        System.out.println(template.operationTemplate());
    }
}
