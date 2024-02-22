package foundation;

import java.util.*;

public class PalindromeNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(palindromeNumber(x) ? "true" : "false");
	}

	static boolean palindromeNumber(int x) {
		if (x < 0)
			return false;
		int num = x;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		return (rev == x) ? true : false;
	}
}
