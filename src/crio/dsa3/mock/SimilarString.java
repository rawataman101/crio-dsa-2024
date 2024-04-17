package crio.dsa3.mock;

import java.util.*;

public class SimilarString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String first_string = sc.next();
            String second_string = sc.next();
            String answer = similarString(n, m, first_string, second_string, k);
            System.out.println(answer);
        }
        sc.close();
    }

    static String similarString(int n, int m, String s1, String s2, int k) {

        int[] freq1 = new int[26]; // Array to store frequency of characters in s1
        int[] freq2 = new int[26]; // Array to store frequency of characters in s2

        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++; // Increment the frequency of character c in s1
        }
        display(freq1);
        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++; // Increment the frequency of character c in s2
        }
        display(freq2);

        for (int i = 0; i < 26; i++) {
            if (Math.abs(freq1[i] - freq2[i]) > k) {
                return "No"; // If the difference between the frequencies of any character is greater than k, they cannot be similar
            }
        }

        return "Yes"; // If all conditions are satisfied, the strings are similar
    }

    static void display(int[] arr) {
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
