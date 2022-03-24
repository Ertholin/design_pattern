package com.ertho.designpatterns.decorator;

public class DecoratorMain {

    /**
     * Decorateur : Decorer les objets sans avoir a modifier l'objet en question
     * @param args
     */

    public static void main(String[] args) {
        Boisson espresso = new Espresso();
        System.out.println("Description : " +espresso.getDescription() + " | Prix : " + espresso.cout());

        espresso = new Lait(espresso);
        System.out.println("Description : " +espresso.getDescription() + " | Prix : " + espresso.cout());

        espresso = new Chocolat(espresso);
        System.out.println("Description : " +espresso.getDescription() + " | Prix : " + espresso.cout());

    }
}
