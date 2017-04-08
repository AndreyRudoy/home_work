package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Customer {
    private long id;
    private String name;
    private String phone;
    private int cardNumber;

    public Customer() {
    }

    public Customer(long id, String name, String phone, int cardNumber) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.cardNumber = cardNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        String s = "" + id + ". " + name + " - " + cardNumber;
        return s;
    }
}
