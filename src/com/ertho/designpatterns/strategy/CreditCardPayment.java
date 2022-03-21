package com.ertho.designpatterns.strategy;

public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void payment() {
        System.out.println("Credit card payment completed successfully");
    }
}
