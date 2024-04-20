package crio.dsa3.linkedlist;

import java.util.HashMap;

class NodeD {
    public int val;
    public NodeD next;
    public NodeD random;

    public NodeD(int _val, NodeD _next, NodeD _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};

public class CopyLinkedList {
    public static void main(String[] args) {

    }

    public NodeD copyRandomList(NodeD head) {
        HashMap<NodeD, NodeD> map = new HashMap<>();
        NodeD curr = head;
        // iterate over the linkedlist to create node and put it in map
        while (curr != null) {
            NodeD copyNode = new NodeD(curr.val, null, null);
            map.put(curr, copyNode); // original => copy
            curr = curr.next;
        }
        //iterate over the linkedlist to populate the next random pointers
        curr = head;
        while (curr != null) {
            NodeD copyNode = map.get(curr);
            NodeD copyNextNode = map.get(curr.next);
            NodeD copyRandomNode = map.get(curr.random);

            copyNode.next = copyNextNode;
            copyNode.random = copyRandomNode;
            curr = curr.next;
        }

        NodeD copyHead = map.get(head);
        return copyHead;
    }
}
