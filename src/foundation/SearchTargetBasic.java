package foundation;

import java.util.*;

public class SearchTargetBasic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int A[] = new int[N];
		for (int i = 0; i < N; i++)
			A[i] = sc.nextInt();

		int res = searchTarget(N, A, X);
		System.out.println(res);

	}

	static int searchTarget(int n, int arr[], int x) {
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

}
