package com.ertho.designpatterns.strategy;

public class PaypalPayment implements PaymentStrategy{
    @Override
    public void payment() {
        System.out.println("Paypal payment completed successfully");
    }
}
