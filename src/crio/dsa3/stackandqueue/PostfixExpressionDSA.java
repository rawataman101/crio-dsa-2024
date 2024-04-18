package crio.dsa3.stackandqueue;

import java.util.*;

class PostfixExpressionDSA {
    // NOTE: Please do not modify this function
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();

        int val = postfixExpression(exp);
        System.out.println(val);
    }

    // TODO: Implement this method
    static int postfixExpression(String exp) {
        Stack<Integer> stack = new Stack<>();
        String[] arr = exp.split(" ");
        for (String i : arr) {
            int a = 0;
            int b = 0;
            if (i.equals("+")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a + b);
            } else if (i.equals("-")) {
                b = stack.pop();
                a = stack.pop();
                stack.push(a - b);
            } else if (i.equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.push(a * b);
            } else {
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.peek();
    }
}
