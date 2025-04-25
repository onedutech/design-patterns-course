package com.onedutech.dp.comportement.observer.simple;

public class Application {

    public static void main(String[] args) {
        ObservableImp simpleSubject = new ObservableImp();

        ObserverImp observerImp = new ObserverImp(simpleSubject);

        simpleSubject.setValue(80);
        simpleSubject.removeObserver(observerImp);
        simpleSubject.setValue(80);
        simpleSubject.registerObserver(observerImp);
        simpleSubject.setValue(80);
    }
}
