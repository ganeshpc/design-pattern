package org.example.adapter;

public interface PaymentProvider {
    void pay();

    PaymentStatus status();
}
