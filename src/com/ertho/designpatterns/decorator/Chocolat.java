package com.ertho.designpatterns.decorator;

public class Chocolat extends BoissonDecorator{
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 3.5 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }
}
