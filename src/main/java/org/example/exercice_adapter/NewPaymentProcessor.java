package org.example.exercice_adapter;

public class NewPaymentProcessor {

    public void authenticate(String apiKey) {
        System.out.println("Authenticated " + apiKey);
    }

    public void sendPayment(double amount) {
        System.out.println("Payed " + amount + "€");
    }
}