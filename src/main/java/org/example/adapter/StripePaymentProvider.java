package org.example.adapter;

public class StripePaymentProvider implements PaymentProvider{

    StripeApi stripeApi = new StripeApi();
    @Override
    public void pay() {
        stripeApi.makePayment();
        return;
    }

    @Override
    public PaymentStatus status() {
        StripePaymentStatus status = stripeApi.getStatus();
        if (status == StripePaymentStatus.SUCCESS) {
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAIL;
    }
}
