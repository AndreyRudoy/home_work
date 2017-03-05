package com.rudoy.hm003;

/**
 * Created by OmEz on 05.03.2017.
 */
public class IssueTen {
    public static void main(String[] args) {
        // Дано целое число k (1⩽ k ⩽365). Определить, каким днем недели
        // (понедельником, вторником, ..., субботой или воскресеньем)
        // является k-й день невисокосного года, в котором 1 января:
        // а) понедельник;
        // б)* d-й день недели (если 1 января — понедельник, то d = 1 ,
        // если вторник — d = 2 , ..., если воскресенье — d = 7).
        int k = 1;
        int d = 3;
        int remind = (k + d - 1) % 7;
        String day;
        switch (remind) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            default:
                day = "Воскресенье";
                break;
        }
        System.out.println(day);
    }
}
