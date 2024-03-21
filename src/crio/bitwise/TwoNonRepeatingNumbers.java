package crio.bitwise;

import java.util.*;

class TwoNonRepeatingNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int ans[] = twoNonRepeatingNumbers(nums);
        System.out.println(ans[0] + " " + ans[1]);
        sc.close();
    }

    static int[] twoNonRepeatingNumbers(int[] nums) {
        int xor1 = 0;
        for (int i : nums) {
            xor1 = xor1 ^ i;
        }

        // get the right-most bit
        //xor1 ^ -xor1
        int rsb = Integer.lowestOneBit(xor1);
        int xor2 = 0;
        for (int i : nums) {
            // XOR only when right most bit is set
            if ((i & rsb) != 0)
                xor2 = xor2 ^ i;
        }
        return new int[]{Math.min(xor2, xor2 ^ xor1), Math.max(xor2, xor2 ^ xor1)};
    }
}
