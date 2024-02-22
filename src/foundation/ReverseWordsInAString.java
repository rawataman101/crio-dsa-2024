package foundation;

import java.util.*;

public class ReverseWordsInAString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(reverseWordsInAString(s));
		sc.close();
	}

	static String reverseWordsInAString(String s) {
		Stack<String> stack = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		for (String i : s.split(" ")) {
			stack.add(i);
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop()).append(" ");
		}
		return sb.toString().trim();

	}
}
