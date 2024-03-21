package crio.bitwise;

import java.util.*;

public class SwapAllOddAndEvenBits {

    public boolean checkSetBit(long n, int bit) {
        //if(n & (1 << bit) != 0) return true else false
        return (n & (1L << bit)) != 0;
    }

    public long setBit(long n, int bit) {
        // return n | (1 << bit)
        return n | (1L << bit);
    }

    public long swapBits(long n) {
        long ans = 0;
        // run the loop from back to check the bit
        // at odd position check the bit - 1 position
        // at even position check the bit + 1 position
        for (int bit = 0; bit < 32; bit++) {
            if (checkSetBit(n, bit)) {
                if (bit % 2 == 1) ans = setBit(ans, bit - 1);
                else ans = setBit(ans, bit + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        long result = new SwapAllOddAndEvenBits().swapBits(n);
        System.out.println(result);
    }
}

