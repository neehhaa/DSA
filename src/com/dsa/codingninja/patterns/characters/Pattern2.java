package com.dsa.codingninja.patterns.characters;
import java.util.Scanner;

/*

    ABCD
    BCDE
    CDEF
    DEFG

 */

public class Pattern2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        char character = 'A';
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows ; j++) {
                System.out.print((char)(character + j - 1));
            }
            System.out.println();
            character = (char)(character + 1);
        }
    }
}
