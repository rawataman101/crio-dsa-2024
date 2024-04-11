package barraiser;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1, 2, 3
        };
        List<List<Integer>> res = permute(arr);

        //displaying result
        System.out.println("res = " + res);
        Set<ArrayList<Integer>> set = new HashSet<>();
        for(List<Integer> i : res) {
            set.add((ArrayList<Integer>) i);
        }
        System.out.println("set = " + set);

    }

    private static void recurPermute(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        // base case if data structure is full then return
        if (ds.size() == arr.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        // iterate
        for (int i = 0; i < arr.length; i++) {
            // if frequency[i] == false that means item is unvisited
                // 1. then first mark as true
                // 2. add to data structure
                // 3. call recursive function
                // 4. remove last element from ds
                // 5. then mark that frequency as unvisited
            if (!freq[i]) {
                freq[i] = true;
                ds.add(arr[i]);
                recurPermute(arr, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public static List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>(); // store the main answer array of lists
        List<Integer> ds = new ArrayList<>(); // store one list item
        boolean[] freq = new boolean[arr.length]; // frequency array to store the visited items
        recurPermute(arr, ds, ans, freq);
        return ans;
    }
}

// tc - O(n! * n)
// sc - O(n) + O(n)