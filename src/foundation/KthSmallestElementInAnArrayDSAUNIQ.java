package foundation;

import java.io.*;
import java.util.*;

public class KthSmallestElementInAnArrayDSAUNIQ {

	// Implement your solution by completing the below function
	public int findKthSmallest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[k-1];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int nums[] = new int[n];
		for (int i = 0; i < n; ++i)
			nums[i] = scanner.nextInt();

		int k = scanner.nextInt();
		scanner.close();

		int result = new KthSmallestElementInAnArrayDSAUNIQ().findKthSmallest(nums, k);
		System.out.println(result);
	}
}
