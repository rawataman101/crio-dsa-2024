package foundation;

import java.util.*;

public class ReverseArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		reverseArray(n, arr);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	static void reverseArray(int n, int arr[]) {
		int i = 0;
		int j = n-1;
		while(i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
