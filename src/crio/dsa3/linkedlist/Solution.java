package crio.dsa3.linkedlist;

import crio.dsa3.linkedlist.demo.*;

public class Solution {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(14);
        ll.add(2);
        ll.add(55);
        System.out.println("before reversing");
        ll.display();
        System.out.println("after reversing");
        new Solution().displayReversedList(reverseLinkedList(ll.head));
    }

    public static Node reverseLinkedList(Node head) {
        Node trail = null, mid = null;
        Node curr = head;
        while (curr != null) {
            trail = mid;
            mid = curr;
            curr = curr.next;
            mid.next = trail;
        }
        return mid;
    }

    public Node moveMiddleToHead(Node head) {
        Node slow = head, fast = head, preSlow = null;
        if (head == null || head.next == null) {
            return head;
        }
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            preSlow = slow;
            slow = slow.next;
        }
        preSlow.next = slow.next;
        slow.next = head;
        return slow;
    }

    public void displayReversedList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + "->");
            curr = curr.next;
        }
        System.out.print("null\n");
    }
}