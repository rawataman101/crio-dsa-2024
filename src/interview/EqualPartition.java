package interview;

import java.util.*;

public class EqualPartition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextLong();

        int res = equalPartition(n, arr);

        System.out.println(res);

    }

    static int equalPartition(int n, long[] arr) {
        //create prefix array
        //edge: if i == 0 then take 0
        long[] pref = new long[n];
        for (int i = 0; i < n; i++) {
            pref[i] = ((i == 0) ? 0 : pref[i - 1]) + arr[i];
        }
        //create suffix array
        //edge: if i = n-1 then take 0
        long[] suffi = new long[n];
        for (int i = n - 1; i >= 0; i--) {
            suffi[i] = ((i == n - 1) ? 0 : suffi[i + 1]) + arr[i];
        }
        //compare both array anc return the index
        for (int i = 0; i < n; i++) {
            if (pref[i] == suffi[i]) return i;
        }
        return -1;
    }
}
