package org.example.exercice_adapter;

public class Client {
    public static void main(String[] args) {
        OldPaymentGateway oldPaymentGateway = new PaymentAdapter();
        oldPaymentGateway.makePayment("123456789", 100.0);

        OldPaymentGateway newPaymentProcessor = new PaymentAdapter();
        newPaymentProcessor.makePayment("987654321", 200.0);
    }
}
