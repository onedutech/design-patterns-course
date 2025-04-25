package com.onedutech.dp.comportement.observer.simple;

public interface Observable {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
