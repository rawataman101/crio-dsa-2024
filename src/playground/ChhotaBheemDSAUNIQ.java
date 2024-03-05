package playground;

import java.util.*;

public class ChhotaBheemDSAUNIQ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = chhotaBheem(n, arr);
		System.out.println(ans);
	}

	static int chhotaBheem(int n, int arr[]) {
		if (arr.length == 0 || arr == null)
			return 0;
		int day = 0;
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			if (arr[i] >= day + 1) {
				day++;
			}
		}

		return day;

	}

	private static void display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
