package crio.dsa3.stackandqueue;

import java.util.*;

public class BackspaceStringCompare {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            String S = sc.next();
            String T = sc.next();

            boolean res = backspaceStringCompare(S, T);

            if (res)
                System.out.println(true);
            else
                System.out.println(false);

        }
    }

    static boolean backspaceStringCompare(String S, String T) {
        // create 2 stack
        // for string1 iterate and push to stack
        // if # found than pop()
        // do it for other string2
        // compare the stack

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char i : S.toCharArray()) {
            if (i == '#' && !stack1.isEmpty()) {
                stack1.pop();
                continue;
            }
            stack1.push(i);
        }
        for (char i : T.toCharArray()) {
            if (i == '#' && !stack2.isEmpty()) {
                stack2.pop();
                continue;
            }
            stack2.push(i);
        }

        // compare
        while(!stack1.isEmpty()) {
            if(stack1.pop() != stack2.pop()) {
                return false;
            }
        }
        return true;
    }

}
