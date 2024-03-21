package crio.bitwise;

import java.util.*;


class NumberOfOneBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans = numberOfOneBits(n);
        System.out.print(ans);
    }

    static int numberOfOneBits(long n) {
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (checkSetBit(n, i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkSetBit(long n, int bit) {
        if ((n & (1L << bit)) > 0) return true;
        else return false;
    }
}
