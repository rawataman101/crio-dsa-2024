package crio.dsa2;

import java.util.*;

public class MinDiff {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int res = minDiff(n, a);

		System.out.println(res);

	}

	static int minDiff(int n, int a[]) {
		Arrays.sort(a);
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; i++) {
			ans = Math.min(ans, a[i+1] - a[i]);
		}
		return ans;
	}
}
