package com.dsa.codingninja.patterns.triangle;

import java.util.Scanner;

/*

    1
    12
    123
    1234

 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
