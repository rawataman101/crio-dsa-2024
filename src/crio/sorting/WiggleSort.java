package crio.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class WiggleSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer>nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        List<Integer>ans = wiggleSort(n,nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i)+" ");
        }
    }

    static void swap(List<Integer> arr, int i, int j) {
    	int temp = arr.get(i);
    	arr.set(i, arr.get(j));
    	arr.set(j, temp);
    }
    static List<Integer> wiggleSort(int n, List<Integer>nums){
    	/*
    	 * 1. iterate
    	 * 2. if at even position curr > curr + 1 than swap
    	 * 3. if at odd position curr < curr + 1 than swap
    	 */
    	for(int i = 0 ; i< n - 1; i++) {
    		if(i % 2 ==0 && nums.get(i) > nums.get(i+1)) {
    			swap(nums, i, i+1);
    		}
    		if(i % 2 == 1 && nums.get(i) < nums.get(i+1)) { 
    			swap(nums, i, i+1);
    		}
    	}
    	
		return nums;
    }
}
