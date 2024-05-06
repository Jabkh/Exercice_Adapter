package org.example.exercice_adapter2;

public class NotificationAdapter implements SmsService{

    EmailService emailService;

    public NotificationAdapter(){
        emailService = new EmailService();
    }

    @Override
    public void sendSms(String number, String message) {
        emailService.sendMail(number, "SMS", message);
    }

}
