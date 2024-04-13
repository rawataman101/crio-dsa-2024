package interview;

import java.util.Scanner;

public class MinimumOperations {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(minOperations(str));
    }

    public static int minOperations(String str) {
        int n = str.length();
        int ans = 0;

        // Iterate over all characters in the string
        for (int i = 0; i < n; ) {
            int j = i;

            // Find the maximal length of the substring having the same character
            while (j < n && str.charAt(j) == str.charAt(i)) {
                j++;
            }

            // Calculate the length of this substring
            int len = j - i;

            // Add floor(len / 2) to the answer
            ans += len / 2;

            // Move to the next character after the end of the substring
            i = j;
        }

        return ans;
    }
}
