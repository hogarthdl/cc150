/**
 * Created by hogarth on 2016/5/8.
 * 2.7 Implement a function to check if a linked list is a palindrome.
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

public class Palindrome {
    public boolean isPalindrome0(ListNode pHead) {
        StringBuilder sb = new StringBuilder();
        while (pHead != null) {
            sb.append(pHead.val);
            pHead = pHead.next;
        }
        System.out.print(sb);
        for (int i = 0; i < sb.length() / 2; i++) {
            if (sb.charAt(i) != sb.charAt(sb.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
     public boolean isPalindrome1(ListNode pHead) {
         ListNode fast = pHead;
            ListNode slow = pHead;
            Stack<Integer> st = new Stack<Integer>();
 
            while(fast != null && fast.next != null){
                st.push(slow.val);
                slow = slow.next;
                fast = fast.next.next;
            }
             
            if(fast != null){
                slow = slow.next;
            }
 
            while(slow != null){
                if(st.pop() != slow.val)
                    return false;
                slow = slow.next;
            }
            return true;
    }
}
