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

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                int temp;
                if (bubble[j] > bubble[j+1]){
                    temp = bubble[j];
                    bubble[j]= bubble[j+1];
                    bubble[j+1] = temp;
                }
            }
            System.out.println(Arrays.toString(bubble));

        }
        System.out.println(Arrays.toString(bubble));
    }
}
