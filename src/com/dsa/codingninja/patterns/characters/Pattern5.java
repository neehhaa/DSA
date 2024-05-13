package com.dsa.codingninja.patterns.characters;
import java.util.Scanner;

/*

    E
    DE
    CDE
    BCDE
    ABCDE

 */

public class Pattern5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        char character = (char)('A' + rows - 1);
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print((char)(character + j - 1));
            }
            System.out.println();
            character = (char)(character - 1);
        }
    }
}
