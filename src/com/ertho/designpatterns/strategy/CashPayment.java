package com.ertho.designpatterns.strategy;

public class CashPayment implements PaymentStrategy{

    @Override
    public void payment() {
        System.out.println("Cash payment completed successfully");
    }
}
