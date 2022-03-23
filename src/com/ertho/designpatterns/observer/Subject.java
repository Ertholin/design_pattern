package com.ertho.designpatterns.observer;

import java.util.LinkedList;
import java.util.List;

public abstract class Subject {

    private List<ObserverTemp> listObservers = new LinkedList<ObserverTemp>();

    public void attach(ObserverTemp o) {
        listObservers.add(o);
    }

    public void detach(ObserverTemp o) {
        listObservers.remove(o);
    }

    public void notifyObservers() {
        for (ObserverTemp obv : listObservers) {
            obv.update();
        }
    }

}
