package crio.dsa2;

import java.util.*;

class CountOccurrences {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int res = countOccurrences(n, k, a);

        System.out.println(res);
    }

    static int countOccurrences(int n, int k, int a[]) {
        int firstIndex = getFirstIndex(a, k, n);
        int lastIndex = getLastIndex(a, k, n);
        return (lastIndex >= firstIndex) ? lastIndex - firstIndex + 1 : 0;

    }

    static int getFirstIndex(int[] a, int k, int n) {
        int left = 0, right = n - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == k) {
                right = mid - 1;
            } else if (a[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    static int getLastIndex(int[] a, int k, int n) {
        int left = 0, right = n - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] == k) {
                left = mid + 1;
            } else if (a[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

}