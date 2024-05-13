package com.dsa.codingninja.patterns.triangle;

import java.util.Scanner;

/*

    1
    21
    321
    4321

*/
public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i-j+1);
            }
            System.out.println();
        }

    }
}
