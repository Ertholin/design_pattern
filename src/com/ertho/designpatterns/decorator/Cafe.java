package com.ertho.designpatterns.decorator;

public class Cafe extends Boisson{

    public Cafe(){
        description = "Cafe";
    }

    @Override
    public double cout() {
        return 3.2;
    }
}
