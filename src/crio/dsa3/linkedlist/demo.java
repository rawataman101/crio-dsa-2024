package crio.dsa3.linkedlist;

class Node {
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}
class LinkedList {
    public Node head;
    public LinkedList() {
        this.head = null;
    }

    public void add(int val) {
        Node temp = new Node(val);
        if(this.head == null) {
            this.head = temp;
        } else {
            Node curr = this.head;
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
        }
    }

    public void display() {
        Node curr = this.head;
        while(curr != null) {
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.print("null\n");
    }
}
public class demo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(5);
        ll.add(14);
        ll.add(2);
        ll.add(55);
        ll.display();
    }
}
