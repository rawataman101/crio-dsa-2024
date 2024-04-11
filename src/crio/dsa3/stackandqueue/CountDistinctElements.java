package crio.dsa3.stackandqueue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class CountDistinctElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        ArrayList<Integer> res = countDistinctElements(n, b, arr);

        for (int j : res)
            System.out.print(j + " ");

    }

    static ArrayList<Integer> countDistinctElements(int n, int k, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while(j < n) {
            if(map.containsKey(arr[j])) {
                map.put(arr[j], map.get(arr[j])+1);
            } else {
                map.put(arr[j], 1);
            }
            if(j - i + 1 == k) {
                ans.add(map.size());
                //reduce the window size
                if(map.get(arr[i]) == 1) {
                    map.remove(arr[i]);
                } else {
                    map.put(arr[i], map.get(arr[i]) - 1);
                }
                i++;
            }
            j++;
        }

        return ans;
    }
}
