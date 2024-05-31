package com.dsa.striversheet.recursion;

import java.util.Scanner;

public class NamesNTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printName(n);

    }

    public static void printName(int n) {
        //base codition
        if (n == 0) {
            return;
        }
        System.out.println("Neha");
        n--;
        printName(n);
    }
}
