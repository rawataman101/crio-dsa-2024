package crio.dsa3.stackandqueue;

import java.util.*;

class MinStack {
    static Stack<Integer> stack = new Stack<Integer>();
    static Stack<Integer> min = new Stack<Integer>();

    static void push(Integer e) {
        stack.push(e);
    }
    static void pop() {
        if(!stack.isEmpty()) {
            stack.pop();
        }
    }
    static Integer findMin() {
        Integer ans = Integer.MAX_VALUE;
        // push all values to min stack and calculate min value simultaneously
        // then push all values to og stack

        while(!stack.isEmpty()) {
            Integer temp = stack.peek();
            ans = Math.min(temp, ans);
             min.push(temp);
             stack.pop();
        }

        while(!min.isEmpty()) {
            stack.push(min.pop());
        }
        return ans == Integer.MAX_VALUE? -1 : ans;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            Integer a = sc.nextInt();
            if (a == 1) {
                Integer e = sc.nextInt();
                push(e);
            }
            if (a == 2) {
                pop();
            }
            if (a == 3) {
                System.out.println(findMin());
            }
        }
    }
}
