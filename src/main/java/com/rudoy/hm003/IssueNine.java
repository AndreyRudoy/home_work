package com.rudoy.hm003;

/**
 * Created by OmEz on 05.03.2017.
 */
public class IssueNine {
    public static void main(String[] args) {
        //Шаровая на фольцваген стоит 300 грн. Напечатать таблицу стоимости 2, 3, ..., 20 штук этого товара.
        int price = 300;
        for (int i = 2; i < 21; i++) {
            System.out.println("Стоимость " + i + " детали(ей) равна " + i * price);
        }
    }

}
