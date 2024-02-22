package sorting;
import java.util.Random;

public class BubbleSort {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Before");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("After");
		printArray(arr);

	}

	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

	private static void printArray(int[] arr) {
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}

}
