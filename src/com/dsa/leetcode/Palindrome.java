package com.dsa.leetcode;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");

        int number = input.nextInt();
        System.out.println(reverse(number));

    }
    public static boolean reverse(int number){
        int reverse = 0;
        int x = number;

        while (x > 0 ){
            int temp= x % 10;
            x = x / 10;
            reverse = (reverse * 10 ) + temp;
        }
        return reverse == number;

    }

}
