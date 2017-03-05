package com.rudoy.hm003;

/**
 * Created by OmEz on 05.03.2017.
 */
public class IssueEleven {
    public static void main(String[] args) {
        //Дано натуральное число
        //(1⩽ n ⩽9999), определяющее стоимость товара в копейках.
        //Выразить стоимость в рублях и копейках, например, 3 рубля 21 копейка, 15 рублей 5 копеек, 1 рубль ровно и т. п.
        int n = 628;
        int rub = n / 100;
        String _rubli;
        switch (rub % 100) {
            case 1:
                _rubli = "рубль";
                break;
            case 2:
                _rubli = "рубля";
                break;
            case 3:
                _rubli = "рубля";
                break;
            case 4:
                _rubli = "рубля";
                break;
            default:
                _rubli = "рублей";
                break;
        }

        int cop = n % 100;
        String _kopeyki;
        switch (cop % 10) {
            case 1:
                _kopeyki = "копейка";
                break;
            case 2:
                _kopeyki = "копейки";
                break;
            case 3:
                _kopeyki = "копейки";
                break;
            case 4:
                _kopeyki = "копейки";
                break;
            default:
                _kopeyki = "копеeк";
                break;
        }
        System.out.println(rub + " " + _rubli + " " + cop + " " + _kopeyki);
    }
}
