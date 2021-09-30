package com.example.application.SmsHandy.model;

public class PrepaidPhone extends Phone {
    private double contForSms = 5;

    public PrepaidPhone(String name, String number, Provider provider) {
        super(name, number, provider);
    }


    @Override
    public boolean canSendMessage() {
        if (this.getBalance() - contForSms >= 0) {
            return true;
        } else return false;
    }

    @Override
    public void payForMessage() {
        this.setBalance(getBalance() - contForSms);
    }
}
