package com.bridgelabz.dataStructure.day16_17_Problems;

import java.util.ArrayList;
import java.util.Collections;

public class PrimeAnagramPalindrome {

    // method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method to check if two numbers are anagrams
    public static boolean isAnagram(int num1, int num2) {
        ArrayList<Integer> num1Digits = new ArrayList<>();
        ArrayList<Integer> num2Digits = new ArrayList<>();

        while (num1 > 0) {
            num1Digits.add(num1 % 10);
            num1 /= 10;
        }

        while (num2 > 0) {
            num2Digits.add(num2 % 10);
            num2 /= 10;
        }

        Collections.sort(num1Digits);
        Collections.sort(num2Digits);

        return num1Digits.equals(num2Digits);
    }

    // method to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        int rangeStart = 0;
        int rangeEnd = 1000;

        System.out.println("Prime numbers that are both anagrams and palindromes in the range [" + rangeStart + ", " + rangeEnd + "]:");
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (isPrime(i) && isAnagram(i, i) && isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

