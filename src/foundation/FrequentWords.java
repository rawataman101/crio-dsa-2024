package foundation;

import java.util.*;

public class FrequentWords {
	public static Vector<String> frequentWords(Vector<String> vec, int k) {
		Vector<String> ans = new Vector<>();
		HashMap<String, Integer> map = new HashMap<>();
		for (String i : vec) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);

			} else {
				map.put(i, 1);
			}
		}
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int f1 = map.get(o1);
				int f2 = map.get(o2);
				if (f1 == f2)
					return o2.compareTo(o1);
				return f1 - f2;
			}
		});

		for (Map.Entry<String, Integer> i : map.entrySet()) {
			pq.add(i.getKey());
			if (pq.size() > k)
				pq.poll();
		}
		while (!pq.isEmpty()) {
			ans.add(pq.poll());
		}
		Collections.reverse(ans);
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
