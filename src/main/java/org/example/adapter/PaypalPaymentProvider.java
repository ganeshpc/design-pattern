package org.example.adapter;

public class PaypalPaymentProvider implements PaymentProvider {
    PaypalApi paypalApi = new PaypalApi();
    @Override
    public void pay() {
        paypalApi.createPayment();
    }

    @Override
    public PaymentStatus status() {
        PaypalPaymentStatus status = paypalApi.checkStatus();
        if (status == PaypalPaymentStatus.SUCCESS) {
            return  PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAIL;
    }
}
