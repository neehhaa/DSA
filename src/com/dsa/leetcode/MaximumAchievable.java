package com.dsa.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumAchievable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in celsius :");
        double celsius = input.nextDouble();
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }

    public static double[] convertTemperature(double celsius) {

        double[] temperature = new double[2];
        temperature[0] = celsius + 273.15;
        temperature[1] = (celsius * 1.80) + 32.00;
        return temperature;
    }
}
