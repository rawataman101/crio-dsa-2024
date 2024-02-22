package level1;

import java.util.*;

public class FactorialDigitSum {

	static List<Integer> list = new ArrayList<>();

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = factorialDigitSum(n);

		System.out.print(ans);

	}

	static int factorialDigitSum(int n) {
		list.add(1);
		for (int i = 2; i <= n; i++) {
			calMul(i);
		}

		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

	static void calMul(int n) {
		int c = 0;
		int s = list.size();
		for (int i = 0; i < s; i++) {
			int res = list.get(i) * n + c;
			list.set(i, res % 10);
			c = res / 10;
		}
		while (c != 0) {
			list.add(c % 10);
			c /= 10;
		}
	}
}
