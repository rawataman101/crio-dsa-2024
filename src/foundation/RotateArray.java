package foundation;

import java.util.*;

public class RotateArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			numbers.add(sc.nextInt());
		}
		ArrayList<Integer> ans = rotateArray(numbers, k);
		for (Integer x : ans) {
			System.out.print(x + " ");
		}
	}

	static ArrayList<Integer> rotateArray(ArrayList<Integer> numbers, int k) {
		int n = numbers.size();
        ArrayList<Integer> newList = new ArrayList<>(numbers);
		k = k % n;
		for (int i = 0; i < n; i++) {
			int newIndex = (i + k >= n) ? i + k - n : i + k;
			newList.set(newIndex, numbers.get(i));
		}
		return newList;
	}

	private static void displayNumbers(ArrayList<Integer> ans) {
		for (Integer x : ans) {
			System.out.print(x + " ");
		}
	}
	
}
