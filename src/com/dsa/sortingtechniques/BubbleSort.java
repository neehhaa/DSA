package com.dsa.sortingtechniques;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] bubble = new int[n];

        for (int i = 0; i < n; i++) {
            bubble[i] = input.nextInt();
        }


        for (int curr = 0; curr < n - 2; curr++) {
            for (int comp = 0; comp < n - 1 - curr; comp++) {
                int temp;
                if (bubble[comp] > bubble[comp + 1]) {
                    temp = bubble[comp];
                    bubble[comp] = bubble[comp + 1];
                    bubble[comp + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(bubble));
    }
}
