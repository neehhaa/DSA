package com.dsa.codingninja.patterns.characters;
import java.util.Scanner;

/*

    A
    BB
    CCC
    DDDD

 */

public class Pattern3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        char character = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(character);
            }
            System.out.println();
            character = (char)(character + 1);
        }
    }
}
