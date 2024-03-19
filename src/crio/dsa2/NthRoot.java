package crio.dsa2;

import java.util.*;

class NthRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int x = sc.nextInt();
            int n = sc.nextInt();

            int ans = nthRoot(x, n);

            System.out.println(ans);
        }
    }

    static int nthRoot(int x, int n) {
        // find nth root of x
        int l = 1;
        int r = x;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (Math.pow(mid, n) == x) {
                return mid;
            } else if (Math.pow(mid, n) > x) {
                ans = mid - 1;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}

// time - log x * log n (find power * binary search)