package interview;

import java.util.*;

public class LargestSubarraySumZero {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> res = largestSubarraySumZero(n, arr);

        for (int j : res)
            System.out.print(j + " ");

    }


    static ArrayList<Integer> largestSubarraySumZero(int n, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int ansl = -1;
        int ansr = -1;
        int sum = 0;
        for (int r = 0; r < n; r++) {
            sum += arr[r];
            if (map.containsKey(sum)) {
                int l = map.get(sum) + 1;
                if(r - l > ansr - ansl) {
                    ansr = r;
                    ansl = l;
                }

            } else {
                map.put(sum, r);
            }
        }

        for (int i = ansl; i <= ansr; i++) {
            ans.add(arr[i]);
        }

        if (ansl == -1 && ans.isEmpty()) {
            ans.add(-1);
        }
        return ans;
    }
}
