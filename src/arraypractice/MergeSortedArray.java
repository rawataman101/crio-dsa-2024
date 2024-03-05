package arraypractice;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
	public static void main(String[] args) {
		int arr1[] = {1,2, 12, 20, 30, 40};
		int arr2[] = { 8, 19, 21 };
		sol(arr1, arr2);
	}

	// with temp array 
	// Time O(n) Space O(n)
	private static void sol(int[] arr1, int[] arr2) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				list.add(arr2[j]);
				j++;
			} else {
				list.add(arr1[i]);
				i++;
			}
		}
		while (i < arr1.length) {
			list.add(arr1[i]);
			i++;
		}
		while (j < arr2.length) {
			list.add(arr2[j]);
			j++;
		}
		System.out.println("Merged Array:");
		System.out.println(list);
	}
	
	//without temp array
	private static void sol2(int[] arr1, int[] arr2) {
		
	}

}