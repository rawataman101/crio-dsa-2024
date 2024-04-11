package crio.dsa3.stackandqueue;

import java.util.*;

public class NextLargerElement {

    static int[] nextLargerElement(int nums[], int n) {
        int[] ans = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                while (!stack.isEmpty() && stack.peek() <= nums[i]) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    ans[i] = -1;
                } else {
                    ans[i] = stack.peek();
                }
            }
            stack.push(nums[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int[] ans = nextLargerElement(ar, n);
        for (int i = 0; i < ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}
