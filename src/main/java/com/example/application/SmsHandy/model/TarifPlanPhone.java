package com.example.application.SmsHandy.model;

public class TarifPlanPhone extends Phone {

    private int costForSms = 1;


    public TarifPlanPhone(String name, String number, Provider provider) {
        super(name, number, provider);
    }

    @Override
    public boolean canSendMessage() {
        return this.getBalance() - costForSms >= 0;
    }

    @Override
    public void payForMessage() {
        this.setBalance(getBalance() - costForSms);

    }
}
