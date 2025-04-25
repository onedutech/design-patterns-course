package com.onedutech.dp.creation.singleton.example;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            ThreadTask task = new ThreadTask("-" + i);
            task.start();
        }
    }

}
