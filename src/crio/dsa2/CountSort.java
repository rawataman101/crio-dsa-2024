package crio.dsa2;

import java.util.*;

public class CountSort {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String s = sc.next();

		String res = countSort(n, s);

		System.out.println(res);

	}

	static String countSort(int n, String s) {
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<>();
		for (char i : s.toCharArray()) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		for (char i = 'a'; i <= 'z'; i++) {
			if(map.containsKey(i)) {
				int v = map.get(i);
				while(v-- > 0) {
					sb.append(i);
				}
			}
		}

		return sb.toString();

	}
}
