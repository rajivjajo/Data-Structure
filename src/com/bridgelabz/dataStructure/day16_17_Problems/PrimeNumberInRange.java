package com.bridgelabz.dataStructure.day16_17_Problems;

public class PrimeNumberInRange {
    public static void main(String[] args) {
        int low = 0, high = 1000;
        System.out.println("The prime numbers between " + low + " and " + high + " are:");
        for (int i = low; i <= high; i++) {
            if (isPrime(i)) {
                System.out.print(i + ",");
            }
        }
    }

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
}
