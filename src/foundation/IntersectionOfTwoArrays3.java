package foundation;

import java.util.*;

public class IntersectionOfTwoArrays3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr1[] = new int[n];
		int arr2[] = new int[m];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}
		int ans[] = intersectionOfTwoArrays(arr1, arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}

	static boolean hasElementB(int[] arr, int key) {
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			int mid = (i + j) / 2;
			if (arr[mid] == key) {
				return true;
			} else if (arr[mid] > key) {
				j = mid - 1;
			} else {
				i = mid + 1;
			}
		}
		return false;
	}
	
	static boolean hasElement(int[] arr, int key) {
		for(int i : arr) {
			if(key == i) {
				return true;
			}
		}
		return false;
	}

	static int[] intersectionOfTwoArrays(int nums1[], int nums2[]) {
		List<Integer> list = new ArrayList<>();
		for (int i : nums1) {
			if (hasElement(nums2, i) == true) {
				if (!list.contains(i))
					list.add(i);
			}
		}
		int[] ans = new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}

}
