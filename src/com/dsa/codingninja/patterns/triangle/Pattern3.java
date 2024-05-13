package com.dsa.codingninja.patterns.triangle;

import java.util.Scanner;

/*

    1
    23
    456
    78910

*/
public class Pattern3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int count = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

    }
}
