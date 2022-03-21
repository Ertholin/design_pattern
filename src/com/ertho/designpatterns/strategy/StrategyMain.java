package com.ertho.designpatterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        PaymentContext paymentContext;

        paymentContext = new PaymentContext(new PaypalPayment());
        paymentContext.executePayment();

        paymentContext.setPaymentStrategy(new CashPayment());
        paymentContext.executePayment();

        paymentContext.setPaymentStrategy(new CreditCardPayment());
        paymentContext.executePayment();

        paymentContext.setPaymentStrategy(null);
        paymentContext.executePayment();
    }
}
