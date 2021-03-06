package com.example.application.SmsHandy.model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Phone {
    private String name;
    private String number;
    private ArrayList<Message> sendMessagesList;
    private ArrayList<Message> receivedMessagesList;
    private Provider provider;
    private double balance;


    public Phone(String name, String number, Provider provider) {
        this.name = name;
        this.number = number;
        this.balance = 0;
        this.sendMessagesList = new ArrayList<>();
        this.receivedMessagesList = new ArrayList<>();
        this.provider = provider;
        this.provider.register(this);
    }

    public void sendMessage(String to, String content) {
        if (to.equals(this.getNumber())) {
            System.out.println("Введите номер отличный от вашего");
        } else if (to.equals("*500#")) {
            System.out.println("На вашем балансе " + this.getBalance());
        } else if (this.canSendMessage()) {
            Message message = new Message(content, this.getNumber(), to, new Date());
            this.getProvider().sendMessage(message);
        } else {
            System.out.println("Не хватает средств ");
        }
    }

    abstract public boolean canSendMessage();

    abstract public void payForMessage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ArrayList<Message> getSendMessagesList() {
        return sendMessagesList;
    }

    public ArrayList<Message> getReceivedMessagesList() {
        return receivedMessagesList;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void deposit(double amount) {
        this.setBalance(getBalance() + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
