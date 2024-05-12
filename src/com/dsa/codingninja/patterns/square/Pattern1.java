package com.dsa.codingninja.patterns.square;

import java.util.Scanner;

/*

    ****
    ****
    ****
    ****

*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
