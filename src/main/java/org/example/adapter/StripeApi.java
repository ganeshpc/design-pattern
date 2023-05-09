package org.example.adapter;

public class StripeApi {
    public void makePayment() {
        System.out.println("Stripe payment made");
    }

    public StripePaymentStatus getStatus() {
        System.out.println("Stripe payment success");
        return StripePaymentStatus.SUCCESS;
    }
}
