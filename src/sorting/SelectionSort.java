package sorting;

import java.util.Random;

public class SelectionSort {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Before");
		printArray(arr);
		selectionSort(arr);
		System.out.println("After");
		printArray(arr);

	}

	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			int indexMin = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					indexMin = j;
				}
			}
			swap(arr, i, indexMin);
		}

	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
