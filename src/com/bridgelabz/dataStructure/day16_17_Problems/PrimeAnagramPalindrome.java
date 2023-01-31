package com.bridgelabz.dataStructure.day16_17_Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeAnagramPalindrome {

    public static void main(String[] args) {

        // create an array list to store prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        // loop through numbers from 0 to 1000
        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                primeNumbers.add(i);
            }
        }

        // convert ArrayList to array for sorting
        Integer[] primes = primeNumbers.toArray(new Integer[0]);

        // sort the array
        Arrays.sort(primes);

        // loop through the prime numbers array
        for (int i = 0; i < primes.length - 1; i++) {
            for (int j = i + 1; j < primes.length; j++) {
                if (isAnagram(primes[i], primes[j])) {
                    if (isPalindrome(primes[i]) && isPalindrome(primes[j])) {
                        System.out.println(primes[i] + " and " + primes[j] + " are both prime and anagram and palindrome");
                    }
                }
            }
        }
    }

    // method to check if a number is prime or not
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // method to check if two numbers are anagrams
    public static boolean isAnagram(int num1, int num2) {
        char[] num1Chars = Integer.toString(num1).toCharArray();
        char[] num2Chars = Integer.toString(num2).toCharArray();
        Arrays.sort(num1Chars);
        Arrays.sort(num2Chars);
        return Arrays.equals(num1Chars, num2Chars);
    }

    // method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int temp = number;
        int reversed = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            reversed = reversed * 10 + lastDigit;
            temp /= 10;
        }
        return number == reversed;
    }
}
