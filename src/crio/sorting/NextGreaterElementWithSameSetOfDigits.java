package crio.sorting;

import java.util.*;

public class NextGreaterElementWithSameSetOfDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		System.out.print(nextGreaterElementWithSameSetOfDigits(n));
	}

	static int nextGreaterElementWithSameSetOfDigits(int num) {

		char[] arr = String.valueOf(num).toCharArray();
		int ind = -1;
		int n = arr.length;

		for (int i = n - 2; i >= 0; i--) {
			if(arr[i] < arr[i+1]) {
				ind = i; //breakpoint
				break;
			}
		}
		if(ind == -1) {
			return -1;
		}
		
		for(int i = n-1; i > ind; i--) {
			if(arr[i] > arr[ind]) {
				swap(arr, i, ind);
				break;
			}
		}
        Arrays.sort(arr, ind + 1, arr.length);

        int res = Integer.parseInt(new String(arr));
		return res;
	}

	private static void swap(char[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = (char) temp;
	}
}
