package sorting;

import java.util.Random;

public class MergeSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Before");
		printArray(arr);
		mergeSort(arr);
		System.out.println("After");
		printArray(arr);
	}

	private static void mergeSort(int[] arr) {
		int length = arr.length;
		if (length < 2) {
			return;
		}

		int midIndex = length / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[length - midIndex];

		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = arr[i];
		}

		for (int i = midIndex; i < length; i++) {
			rightHalf[i - midIndex] = arr[i];
		}
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		merge(arr, leftHalf, rightHalf);
	}

	private static void merge(int[] mergedArr, int[] left, int[] right) {
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0, j = 0, k = 0;

		while (i < leftSize && j < rightSize) {
			if (left[i] <= right[j]) {
				mergedArr[k] = left[i];
				i++;
			} else {
				mergedArr[k] = right[j];
				j++;
			}
			k++;
		}
		
		//cleanup
		while(i < leftSize) {
			mergedArr[k] = left[i];
			i++;
			k++;
		}
		while(j < rightSize) {
			mergedArr[k] = right[j];
			j++;
			k++;
		}
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
