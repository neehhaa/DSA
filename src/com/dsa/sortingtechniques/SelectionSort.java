package com.dsa.sortingtechniques;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] selection = {49, 53, 9, 17, 4, 20};
        int n = selection.length;
        System.out.println(Arrays.toString(selectionSort(selection, n)));
    }

    public static int[] selectionSort(int[] selection, int n) {

        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i + 1; j <= n - 1; j++) {
                if (selection[min] > selection[j]) {
                    min = j;
                }
            }
            int temp = selection[i];
            selection[i] = selection[min];
            selection[min] = temp;
        }

        return selection;
    }
}
