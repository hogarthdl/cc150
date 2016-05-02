/**
 * Created by hogarth on 2016/5/2.
 * 2.3 Implement an algorithm to delete a node in the middle of a singly linked list,
 * given only access to that node.
 * EXAMPLE
 * Input: the node c from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a- >b- >d->e.
 */

import java.util.*;
 
/*
public class ListNode {
    int val;
    ListNode next = null;
 
    ListNode(int val) {
        this.val = val;
    }
}*/
public class Remove {
    public boolean removeNode(ListNode pNode) {
        if(pNode == null || pNode.next == null) return false;
            ListNode p = pNode.next;
            pNode.val = p.val;
            pNode.next = p.next;
             
            return true;   
    }
}
