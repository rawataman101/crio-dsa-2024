package foundation;

import java.util.*;

public class MaxMin {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
		sc.close();

		int result = maxMin(arr, n);
		System.out.print(Integer.toString(result));
	}

	public static int maxMin(int[] arr, int n) {
		Arrays.sort(arr);
		return arr[0] + arr[n - 1];
	}
}
