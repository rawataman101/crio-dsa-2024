package foundation;

import java.util.*;

public class ReverseStringBasic {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String ans = reverseString(s);
		System.out.println(ans);
		sc.close();
	}

	static String reverseString(String s) {
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder("");

		for(char i : s.toCharArray()) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());	
		}
		return sb.toString();	
	}
}