package com.dsa.leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(palindrome(s));
    }

    public static boolean palindrome(String s) {
        String sentence = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        if (sentence.isEmpty()) {
            return true;
        }
        int n = sentence.length() - 1;
        int i = 0;
        while (i <= sentence.length() / 2) {
            if (sentence.charAt(i) == sentence.charAt(n)) {
                i += 1;
                n -= 1;
            } else {
                return false;
            }
        }
        return true;
    }
}
