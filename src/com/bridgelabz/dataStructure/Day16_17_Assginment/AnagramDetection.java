package com.bridgelabz.dataStructure.Day16_17_Assginment;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String str2 = sc.nextLine();
        sc.close();

        if (str1.length() != str2.length()) {
            System.out.println("The two strings are not anagrams.");
        } else {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("The two strings are anagrams.");
            } else {
                System.out.println("The two strings are not anagrams.");
            }
        }
    }
}
