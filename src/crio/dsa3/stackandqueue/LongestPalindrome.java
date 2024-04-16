package crio.dsa3.stackandqueue;

import java.util.*;

public class LongestPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int res = longestPalindrome(n, s);

        System.out.println(res);
    }

    static int longestPalindrome(int n, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int ans = 0;
        boolean hasOddCount = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            if (count % 2 == 0) {
                ans += count;
            } else {
                ans += count - 1;
                hasOddCount = true;
            }
        }
        if (hasOddCount) ans += 1;
        return ans;
    }
}