package com.onedutech.dp.comportement.observer.simple;

import java.util.ArrayList;
import java.util.List;

public class ObservableImp implements Observable {
    private final List<Observer> observers;
    private int value = 0;

    public ObservableImp() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}