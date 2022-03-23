package com.ertho.designpatterns.observer;

import java.util.Scanner;

public class Thermometer extends Subject{
    private double currentTemp;
    private double windSpeed;
    private double atmophericPressure;

    public Thermometer() {
    }

    public double getTemperature() {
        return currentTemp;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double getPressure() {
        return atmophericPressure;
    }

    public void readValue(){
        do{
            System.out.println("New Temperature: ");
            Scanner scanner = new Scanner(System.in);
            currentTemp = scanner.nextDouble();
            notifyObservers();
        }while (currentTemp >= 0);
    }
}
