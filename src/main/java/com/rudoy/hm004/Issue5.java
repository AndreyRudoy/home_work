package com.rudoy.hm004;

import java.util.Scanner;

/**
 * Created by OmEz on 12.03.2017.
 */
public class Issue5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(i);
            for (int j = 1; j <= i; j++) {
                if(i%j==0){
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}
