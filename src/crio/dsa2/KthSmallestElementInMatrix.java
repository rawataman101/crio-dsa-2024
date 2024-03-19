package crio.dsa2;

import java.util.*;

class KthSmallestElementInMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<ArrayList<Integer>> Matrix = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            Matrix.add(row);
        }
        int ans = kthSmallestElementInMatrix(Matrix, k);
        System.out.print(ans);
    }

    static int kthSmallestElementInMatrix(List<ArrayList<Integer>> Matrix, int k) {
        // 1. find lower and higher points for binary search
        int n = Matrix.size();
        int l = Matrix.get(0).get(0);
        int h = Matrix.get(n - 1).get(n - 1);
        int ans = 0;

        while (l <= h) {
            int mid = (l + h) / 2;
            // 2. if rank >= k search left
            if (Rank(Matrix, mid) >= k) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1; // else search right
            }
        }
        return ans;
    }

    private static int Rank(List<ArrayList<Integer>> matrix, int mid) {
        // run binary search to find count in each row
        int n = matrix.size();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = binarySearch(matrix.get(i), mid);
            count += x;
        }
        return count;
    }

    private static int binarySearch(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        int l = 0;
        int r = n - 1;
        int count = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr.get(mid) > k) {
                r = mid - 1; // search left
            } else {
                count = mid + 1;
                l = mid + 1;
            }
        }
        return count;
    }
}