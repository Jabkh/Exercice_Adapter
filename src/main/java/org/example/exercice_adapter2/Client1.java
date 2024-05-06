package org.example.exercice_adapter2;

public class Client1 {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        emailService.sendMail("mail@mail.com", "mail", "body");

        SmsService smsService = new NotificationAdapter();
        smsService.sendSms("0123456789", "message");
    }
}
