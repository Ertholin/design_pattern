package com.ertho.designpatterns.strategy;

public class PaymentContext {

    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void executePayment(){
        if(paymentStrategy == null){
            System.err.println("No payment method has been defined");
            return;
        }
        paymentStrategy.payment();
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
