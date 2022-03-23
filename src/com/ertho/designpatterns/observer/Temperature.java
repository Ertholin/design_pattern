package com.ertho.designpatterns.observer;

public class Temperature {

    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();

        DisplayCelsius displayC2 = new DisplayCelsius(thermometer);
        thermometer.attach(displayC2);
        DisplayFahrenheit displayF = new DisplayFahrenheit(thermometer);
        thermometer.attach(displayF);

        thermometer.readValue();

    }
}
