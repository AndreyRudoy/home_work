package com.rudoy.hm012;

/**
 * Created by OmEz on 08.04.2017.
 */
public class Issue3 {
    public static void main(String[] args) {
        Abiturient[] abiturients = new Abiturient[]{
                new Abiturient(1, "Andrey", "+380506099060", 2),
                new Abiturient(2, "Alina", "+380506099080", 5),
                new Abiturient(3, "Masha", "+380506099045", 6),
                new Abiturient(4, "Vitya", "+380506099453", 4),
                new Abiturient(5, "Victor", "+380506099076", 8),
                new Abiturient(6, "Sasha", "+380506099023", 10)
        };
        int badMarks = 1 & 2 & 3 & 4 & 5;
        int averageMarks = 7;
        int passingMArks = 9;
        for (int i = 0; i < abiturients.length; i++) {
            if(abiturients[i].getEvaluation() < averageMarks){
                System.out.println("Абитуриент, имеющий неудовлетворительные оценки "+ abiturients[i].toString());
            }
            if(abiturients[i].getEvaluation()> averageMarks){
                System.out.println("Абитуриент, cредний балл у которого  выше заданного " + abiturients[i].toString());
            }
            if(abiturients[i].getEvaluation()>= passingMArks){
                System.out.println("Абитуриент, имеющий проходной балл " + abiturients[i].toString());
            }
        }
    }
}
