package foundation;

import java.io.*;
import java.util.*;

public class SearchInRotatedSortedArrayBasic {

	public int search(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}
		int q = scanner.nextInt();
		while (q > 0) {
			int target = scanner.nextInt();
			int result = new SearchInRotatedSortedArrayBasic().search(nums, target);
			System.out.println(result);
			q--;
		}
	}
}