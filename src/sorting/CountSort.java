package sorting;

import java.util.Random;

public class CountSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Before");
		printArray(arr);
		countSort(arr);
		System.out.println("After");
		printArray(arr);
	}

	private static void countSort(int[] arr) {
		// find max to find the size of the count array
		int k = arr[0];
		for (int i = 0; i < arr.length; i++) {
			k = Math.max(arr[i], k);
		}
		int count[] = new int[k];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		for (int i = 1; i <= k; i++) {
			count[i] += count[i - 1];
		}

		int out[] = new int[arr.length];
		for (int i = arr.length; i >= 0; i--) {
			out[--count[arr[i]]] = arr[i];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = out[i];
		}
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
