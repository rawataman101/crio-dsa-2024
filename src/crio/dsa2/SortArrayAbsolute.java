package crio.dsa2;

import java.util.*;

public class SortArrayAbsolute {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		int res[] = sortArrayAbsolute(n, arr);

		for (int j : res)
			System.out.print(j + " ");
	}

	static int[] sortArrayAbsolute(int n, int arr[]) {
		Integer[] sorted = new Integer[n];
		for (int i = 0; i < n; i++) {
			sorted[i] = arr[i];
		}
		Comparator<Integer> sortByAbsValue = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return Integer.compare(Math.abs(o1), Math.abs(o2));
			}
		};
		Arrays.sort(sorted, sortByAbsValue);
		//Arrays.sort(sorted, (o1, o2) -> Integer.compare(Math.abs(o1), Math.abs(o2)));

		for (int i = 0; i < n; i++) {
			arr[i] = sorted[i];
		}
		return arr;
	}

}
