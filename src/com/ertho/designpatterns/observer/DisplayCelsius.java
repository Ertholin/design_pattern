package com.ertho.designpatterns.observer;

public class DisplayCelsius extends Display{

    public DisplayCelsius(Thermometer thermometer) {
        super(thermometer);
    }

    public double computeValue(){
        return thermometer.getTemperature() * 1.8 - 273.15;
    }

    @Override
    public void update() {
        System.out.println(String.valueOf(computeValue()) + "F\n" + thermometer.getPressure() + "hPa");
    }
}
