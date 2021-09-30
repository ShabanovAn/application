package com.example.application.SmsHandy.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Provider {
    private String name;
    private HashMap<String, Phone> abonentsList;
    private static ArrayList<Provider> providerList = new ArrayList<>();

    public Provider(String name) {
        this.name = name;
        this.abonentsList = new HashMap<>();
        providerList.add(this);
    }

    public Provider findProviderFor(String number) {
        for (Provider provider : providerList) {
            if (provider.getAbonentsList().containsKey(number)) {
                return provider;
            }
        }
        return null;
    }

    public boolean sendMessage(Message message) {
        Provider toProvider = this.findProviderFor(message.getTo());
        if (toProvider != null) {
            Phone toPhone = toProvider.getAbonentsList().get(message.getTo());
            toPhone.getReceivedMessagesList().add(message);
            Phone fromPhone = this.getAbonentsList().get(message.getFrom());
            fromPhone.getSendMessagesList().add(message);
            fromPhone.payForMessage();
            return true;
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Phone> getAbonentsList() {
        return abonentsList;
    }

    public void register(Phone phone) {
        abonentsList.put(phone.getNumber(), phone);
    }

    public void register(Provider provider) {
        providerList.add(provider);
    }

    public static ArrayList<Provider> getProviderList() {
        return providerList;
    }
}
