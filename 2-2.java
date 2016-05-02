/**
 * Created by hogarth on 2016/5/2.
 * 2.2 Implement an algorithm to find the kth to last element of a singly linked list.
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
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
    if(head == null || k < 1)
                    return null;
                         
                    ListNode fir = head;
                    ListNode sec = head;
                    int i = 0;
                    for(; fir != null; i++){
                        fir = fir.next;        
                        if(i >= k)
                            sec = sec.next;
                    }      
                    if(i < k)
                        return null;
                    else
                        return sec;
                }
}
