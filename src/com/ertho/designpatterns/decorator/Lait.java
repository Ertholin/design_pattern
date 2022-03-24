package com.ertho.designpatterns.decorator;

public class Lait extends BoissonDecorator{

    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 1.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.description + " au lait";
    }
}
