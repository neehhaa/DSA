package com.dsa.codingninja.patterns.square;

import java.util.Scanner;

/*

    1111
    2222
    3333
    4444

*/
public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }

    }
}
