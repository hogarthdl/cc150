/**
 * Created by hogarth on 2016/5/2.
 * 2.4 Write code to partition a linked list around a value x, such that all nodes less than
 * x come before all nodes greater than or equal to x.
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
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
    
            if (pHead == null || pHead.next == null)
                return pHead;
 
            ListNode befhead = null;
            ListNode beftail = null;
            ListNode afthead = null;
            ListNode afttail = null;
 
            while (pHead != null) {
                ListNode nextNode = pHead.next;  //要注意这步的写法
                pHead.next = null;
                if (pHead.val < x) {
                    //System.out.println("curNODE < x:" + pHead.val);
                    if (befhead == null) {
                        befhead = pHead;
                        beftail = pHead;
                    } else {
                        beftail.next = pHead;
                        beftail = pHead;
                    }
                } else {
                    if (afthead == null) {
                        afthead = pHead;
                        afttail = pHead;
                    } else {
                        afttail.next = pHead;
                        afttail = pHead;
                    }
                }
                //pHead = pHead.next;
                pHead = nextNode; 
            }
 
            if (befhead == null)
                return afthead;
            else {
                beftail.next = afthead;
                return befhead;
            }
        }
}
