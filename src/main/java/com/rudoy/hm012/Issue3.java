package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Issue3 {
    public static void main(String[] args) {
        Abiturient[] abiturients = new Abiturient[]{
                new Abiturient(1, "Andrey", "+380506099060", new int[]{2, 3, 2, 4}),
                new Abiturient(2, "Alina", "+380506099080", new int[]{5, 9, 7, 10}),
                new Abiturient(3, "Masha", "+380506099045", new int[]{2, 3, 10, 9}),
                new Abiturient(4, "Vitya", "+380506099453", new int[]{5, 7, 2, 4}),
                new Abiturient(5, "Victor", "+380506099076", new int[]{8, 7, 9, 6}),
                new Abiturient(6, "Sasha", "+380506099023", new int[]{8, 9, 6, 5})
        };
        System.out.println("With bed");
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].hasBadMarks()) {
                System.out.println(abiturients[i].toString());
            }
        }
        System.out.println();
        System.out.println("For average");
        int expectedMark = 4;
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].averageMark() > expectedMark) {
                System.out.println(abiturients[i].toString());
            }
        }

        System.out.println();
        System.out.println("With high score");

        double highest = 0.0;
        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].averageMark() > highest) highest = abiturients[i].averageMark();
        }

        for (int i = 0; i < abiturients.length; i++) {
            if (abiturients[i].averageMark() == highest){
                System.out.println(abiturients[i].toString());
            }
        }
    }
}
