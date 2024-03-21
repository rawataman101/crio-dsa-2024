package crio.bitwise;

import java.util.*;

public class Conversion {

    public static int conversion(long A, long B) {
        int c = 0;
        long n = A ^ B;
        while (n != 0) {
            n = n & (n - 1);
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(conversion(a, b));
    }
}

