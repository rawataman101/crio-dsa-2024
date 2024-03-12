package crio.dsa2;

import java.util.*;

public class ZeroOnes {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int res = zeroOnes(n, a);
		System.out.println(res);

	}

	static int zeroOnes(int n, int a[]) {
		int low = 0, high = n - 1, mid, result = -1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid] == 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
				result = mid;
			}
		}
		return result;
	}
}
