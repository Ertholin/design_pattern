package com.ertho.designpatterns.observer;

public class DisplayFahrenheit extends Display{

    public DisplayFahrenheit(Thermometer thermometer) {
        super(thermometer);
    }

    public double computeValue(){
        return thermometer.getTemperature() * 1.8 - 469.67;
    }

    @Override
    public void update() {
        System.out.println(String.valueOf(computeValue()) + "F\n" + thermometer.getWindSpeed() + "m/s");
    }
}
