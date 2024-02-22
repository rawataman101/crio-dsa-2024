package level1;

import java.util.*;

public class NumberOfDivisorsAndSumBasic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans[] = numberOfDivisorsAndSum(n);
		System.out.println(ans[0] + " " + ans[1]);
	}

	static int[] numberOfDivisorsAndSum(int n) {
		int numDivisors = 0, sumDivisors = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				numDivisors++;
				sumDivisors += i;
			}
		}
		return new int[] { numDivisors, sumDivisors };
	}
}
