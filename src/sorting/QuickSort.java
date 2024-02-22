package sorting;

import java.util.Random;

public class QuickSort {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Before");
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("After");
		printArray(arr);
	}

	public static void quickSort(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex >= highIndex) {
			return;
		}

		// randomly selecting pivot
		int index = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = arr[index];
		swap(arr, index, highIndex);

		int leftPointer = lowIndex;
		int rightPointer = highIndex;

		while (leftPointer < rightPointer) {
			while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			swap(arr, leftPointer, rightPointer);
		}
		swap(arr, leftPointer, highIndex);
		quickSort(arr, lowIndex, leftPointer - 1);
		quickSort(arr, leftPointer + 1, highIndex);

	}

	private static void swap(int[] arr, int a, int b) {
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
