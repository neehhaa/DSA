package com.dsa.codingninja.patterns.triangle;

import java.util.Scanner;

/*

    1
    22
    333
    4444

*/
public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
