package com.bridgelabz.dataStructure.day16_17_Problems;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter enter str1 :");
            String str1 = scanner.next();
            System.out.println("Enter enter str2 :");
            String str2 = scanner.next();
            boolean isAnagram = areAnagrams(str1, str2);
            System.out.println("The two strings are anagrams: " + isAnagram);
        }

        public static boolean areAnagrams(String str1, String str2) {
            if (str1.length() != str2.length()) {
                return false;
            }

            char[] char1 = str1.toCharArray();
            char[] char2 = str2.toCharArray();

            Arrays.sort(char1);
            Arrays.sort(char2);

            for (int i = 0; i < char1.length; i++) {
                if (char1[i] != char2[i]) {
                    return false;
                }
            }

            return true;
        }
    }


