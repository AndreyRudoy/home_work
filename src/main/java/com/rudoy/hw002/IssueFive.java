package com.rudoy.hw002;

/**
 * Created by OmEz on 01.03.2017.
 */
public class IssueFive {
    public static void main(String[] args) {
        /*5.  Записать условие, которое является истинным, когда:
        а) каждое из чисел X и Y нечетное;
        б) только одно из чисел X и Y меньше 20;
        в) хотя бы одно из чисел X и Y равно нулю;
        г) каждое из чисел X, Y, Z отрицательное;
        д) только одно из чисел X, Y и Z кратно пяти;
        е) хотя бы одно из чисел X, Y, Z больше 100.*/
        int x, y, z;
        x = 8;
        y = 5;
        z = 12;
        boolean a = ((x % 2) + (y % 2)) == 2;
        boolean b = (x < 20) ^ (y < 20);
        boolean c = (x == 0) ^ (y == 0);
        boolean d = (x < 0) & (y < 0) & (z < 0);
        boolean e = (x % 5 == 0) ^ (y % 5 == 0) ^ (z % 5 == 0);
        boolean f = (x > 100) | (y > 100) | (z > 100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


    }
}
