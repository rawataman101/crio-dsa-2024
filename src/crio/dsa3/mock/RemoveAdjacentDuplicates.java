package crio.dsa3.mock;

import java.util.*;


public class RemoveAdjacentDuplicates {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String result = removeAdjacentDuplicates(s);
        System.out.println(result);

        sc.close();
    }

    static String removeAdjacentDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && c == stack.peek())
                stack.pop();
            else
                stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}

