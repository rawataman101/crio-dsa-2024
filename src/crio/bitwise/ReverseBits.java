package crio.bitwise;

import java.util.*;


class ReverseBits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();

        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = reverseBits(n);
            System.out.println(ans);
        }
    }

    static boolean checkSetBit(long n, int bit) {
        return (n & (1L << bit)) != 0;
    }

    static long setBit(long n, int bit) {
        return (n | (1L << bit));
    }

    static long reverseBits(long n) {
        long ans = 0;
        int l = 31;
        int r = 0;
        while (r < l) {
            //check if the left bit is set if yes than make the right bit set
            if (checkSetBit(n, l)) {
                ans = setBit(ans, r);
            }
            // similarly for right bit
            if (checkSetBit(n, r)) {
                ans = setBit(ans, l);
            }
            r++;
            l--;
        }
        return ans;
    }
}
