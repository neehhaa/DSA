package com.dsa.striversheet.recursion;

import java.util.Scanner;

public class ReverseNaturalNumBacktracking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        printNum(1, n);
    }

    public static void printNum(int i, int n) {
        if (i > n) {
            return;
        }
        printNum(i + 1, n);
        System.out.print(i + " ");
    }

}
