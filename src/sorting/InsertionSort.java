package sorting;

import java.util.Random;

public class InsertionSort {
	public static void main(String[] args) {
			Random rand = new Random();
			int[] arr = new int[10];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rand.nextInt(100);
			}
			System.out.println("Before");
			printArray(arr);
			insertionSort(arr);
			System.out.println("After");
			printArray(arr);

		}

		private static void insertionSort(int[] arr) {
			for(int i = 1; i < arr.length; i++) {
				int temp = arr[i];
				
				int j = i - 1;
				while(j >= 0 && arr[j] > temp) {
					arr[j+1] = arr[j];
					j--;
				}
				arr[j + 1] = temp;
			}
		
	}
		private static void printArray(int[] arr) {
			for(int i : arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
}
