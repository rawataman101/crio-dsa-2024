package crio.dsa3.stackandqueue;

import java.util.*;

public class FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> str = new HashMap<>();
        Map<Character, Integer> pat = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (pat.containsKey(c)) {
                pat.put(c, pat.get(c) + 1);
            } else {
                pat.put(c, 1);
            }
        }

        int i = 0, j = 0, n = s.length(), k = p.length();
        while (j < n) {
            char c = s.charAt(j);
            if (str.containsKey(c)) {
                str.put(c, str.get(c) + 1);
            } else {
                str.put(c, 1);
            }

            if (j - i + 1 == k) {
                if (pat.equals(str)) {
                    ans.add(i);
                }
                c = s.charAt(i);
                if (str.get(c) == 1) {
                    str.remove(c);
                } else {
                    str.put(c, str.get(c) - 1);
                }
                i++;
            }
            j++;

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[2];
        input = scanner.nextLine().split(" ");
        String s = input[0];
        String p = input[1];
        scanner.close();

        List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s, p);
        System.out.println(result.size());
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
        }
    }
}