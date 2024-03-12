package crio.dsa2;

import java.util.*;
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
      int pivot = findPivot(nums);
      int ans = findIndex(nums, 0, pivot, target);
      if(ans != -1) return ans;
      return findIndex(nums, pivot + 1, nums.length - 1, target);
    }
    static int findPivot(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int mid;
        int ans = nums[0];
        while(i <= j) {
            mid = (i + j)/2;
            if(nums[mid] < ans) {
                j = mid - 1;
            }
            else {
                ans = mid;
                i = mid + 1;
            }
        }
        return ans;
    }
    static int findIndex(int[] nums, int left, int right, int target) {

        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        while(q > 0) {
            int target = scanner.nextInt();
            int result = new SearchInRotatedSortedArray().search(nums , target);
            System.out.println(result);
            q--;
        }
    }
}

