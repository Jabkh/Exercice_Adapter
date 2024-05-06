package org.example.exercice_adapter;

public class PaymentAdapter implements OldPaymentGateway {

    private NewPaymentProcessor newPaymentProcessor;


    public PaymentAdapter() {
        newPaymentProcessor = new NewPaymentProcessor();
    }

    @Override
    public void makePayment(String accountNumber, double amount) {
        newPaymentProcessor.authenticate("apiKey");
        newPaymentProcessor.sendPayment(amount);
    }

}
