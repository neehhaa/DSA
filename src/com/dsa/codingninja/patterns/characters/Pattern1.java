package com.dsa.codingninja.patterns.characters;
import java.util.Scanner;

/*

    ABCD
    ABCD
    ABCD
    ABCD

 */

public class Pattern1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows ; j++) {
                System.out.print((char)('A' + j - 1));
            }
            System.out.println();
        }
    }
}
