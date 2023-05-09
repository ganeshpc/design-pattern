package adapter;

import org.example.adapter.PaymentProvider;
import org.example.adapter.PaypalPaymentProvider;
import org.example.adapter.StripePaymentProvider;
import org.junit.jupiter.api.Test;


public class PaymentProcessorTest {

    @Test
    public void testPaypalPaymentProvider() {
        // prints paypal
        PaymentProvider paymentProvider = new PaypalPaymentProvider();
        paymentProvider.status();
        paymentProvider.pay();
    }

    @Test
    public void testStripePaymentProvider() {
        // prints paypal
        PaymentProvider paymentProvider = new StripePaymentProvider();
        paymentProvider.status();
        paymentProvider.pay();
    }
}
