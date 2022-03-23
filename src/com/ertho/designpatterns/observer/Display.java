package com.ertho.designpatterns.observer;

public abstract class Display implements ObserverTemp{

    protected Thermometer thermometer;

    public Display(Thermometer thermometer) {
        this.thermometer = thermometer;
    }


}
