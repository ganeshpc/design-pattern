package org.example.adapter;

public class PaypalApi {
    public void createPayment() {
        System.out.println("Paypal payment made");
    }

    public PaypalPaymentStatus checkStatus() {
        System.out.println("Paypal payment success");
        return PaypalPaymentStatus.SUCCESS;
    }
}
