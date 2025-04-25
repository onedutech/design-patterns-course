package com.onedutech.dp.comportement.observer.simple;

public class ObserverImp implements Observer {
    private int value;
    private Observable simpleObservable;

    public ObserverImp(Observable simpleObservable) {
        this.simpleObservable = simpleObservable;
        simpleObservable.registerObserver(this);
    }

    public void update(int value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Observer say : Value=" + value);
    }
}
