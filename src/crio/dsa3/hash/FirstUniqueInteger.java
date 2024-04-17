package crio.dsa3.hash;

import java.util.*;

class FirstUniqueInteger {
    public static int firstUniqueInteger(Vector<Integer> vec) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : vec) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        for (int key : vec) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<Integer> vec = new Vector<Integer>();
        for (int i = 0; i < n; i++)
            vec.add(sc.nextInt());
        System.out.println(firstUniqueInteger(vec));
    }
}

