package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Issue1 {
    public static void main(String[] args) {
        Customer[] customers = new Customer[]{
                new Customer(1, "Andrey", "+380506099060", 2434532),
                new Customer(2, "Alina", "+380506099080", 2434552),
                new Customer(3, "Masha", "+380506099045", 2434432),
                new Customer(4, "Vitya", "+380506099453", 2434132),
                new Customer(5, "Victor", "+380506099076", 2437532),
                new Customer(6, "Sasha", "+380506099023", 2434932)
        };
        int startInterval = 0;
        int endInterval = 514351435;
        for (int i = 0; i < customers.length; i++) {
            if ((customers[i].getCardNumber() > startInterval) & (customers[i].getCardNumber() < endInterval)) {
                System.out.println(customers[i].toString());
            }
        }
    }
}
