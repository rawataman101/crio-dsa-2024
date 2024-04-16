package crio.dsa3.stackandqueue;

import java.util.*;

class Pair {
    public String word;
    public int count;

    Pair(String word, int count) {
        this.word = word;
        this.count = count;
    }
}

class PairComparator implements Comparator<Pair> {

    @Override
    public int compare(Pair o1, Pair o2) {
        if (o1.count > o2.count) {
            return -1;
        } else if (o2.count > o1.count) {
            return 1;
        } else {
            if (o1.word.compareTo(o2.word) < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}

public class FrequentWords {
    public static Vector<String> frequentWords(Vector<String> vec, int k) {
        Vector<String> ans = new Vector<>();

        // create a map
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : vec) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);

            } else {
                map.put(i, 1);
            }
        }

        // push string and word map to array
        List<Pair> array = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            array.add(new Pair(entry.getKey(), entry.getValue()));
        }

        Collections.sort(array, new PairComparator());
        for(int i = 0; i < k; i++) {
            ans.add(array.get(i).word);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector<String> vec = new Vector<String>();
        for (int i = 0; i < n; i++)
            vec.add(sc.next());
        int k = sc.nextInt();
        Vector<String> ans = frequentWords(vec, k);
        for (int i = 0; i < k; i++)
            System.out.println(ans.get(i));
    }
}
