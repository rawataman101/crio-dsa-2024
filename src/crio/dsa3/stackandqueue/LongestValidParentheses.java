package crio.dsa3.stackandqueue;

import java.util.*;


class LongestValidParentheses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = longestValidParentheses(S);
        System.out.println(ans);
    }

    static int longestValidParentheses(String str) {
        Stack<Integer> stack = new Stack<>();
        int len = 0;
        stack.push(-1);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
                if (!stack.isEmpty()) {
                    len = Math.max(len, i - stack.peek());

                } else {
                    stack.push(i);
                }
            }
        }
        return len;
    }
}