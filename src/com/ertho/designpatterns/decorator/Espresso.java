
package com.ertho.designpatterns.decorator;

public class Espresso extends Boisson{

    public Espresso(){
        description = "Expresso";
    }

    @Override
    public double cout() {
        return 6.5;
    }
}
