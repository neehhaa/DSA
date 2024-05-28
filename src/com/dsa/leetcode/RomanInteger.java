package com.dsa.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanInteger {
    public static void main(String[] args) {
        String s = "III";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> romans = new HashMap<>();
        romans.put('I', 1);
        romans.put('V', 5);
        romans.put('X', 10);
        romans.put('L', 50);
        romans.put('C', 100);
        romans.put('D', 500);
        romans.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = romans.get(s.charAt(i));
            if (i + 1 < s.length()) {
                int next = romans.get(s.charAt((i + 1)));
                if (current >= next) {
                    result += current;
                } else {
                    result += next - current;
                    i++;
                }
            } else {
                result += current;
            }
        }
        return result;
    }
}
