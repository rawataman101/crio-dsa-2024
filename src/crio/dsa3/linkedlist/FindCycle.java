package crio.dsa3.linkedlist;
class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; next = null; }
}
public class FindCycle {
    public boolean linkedListCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }
        return false;
    }
}
