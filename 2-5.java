/**
 * Created by hogarth on 2016/5/7.
 * You have two numbers represented by a linked list, where each node contains a
 * single digit. The digits are stored in reverse order, such that the Ts digit is at the
 * head of the list. Write a function that adds the two numbers and returns the sum as a linked list.
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
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode headNode = new ListNode(1);
        ListNode currentNode = headNode;
        int upvalue = 0;
        while (a != null || b != null || upvalue != 0) {
 
            int avalue = a != null ? a.val : 0;
            int bvalue = b != null ? b.val : 0;
 
            int currentSum = avalue + bvalue + upvalue;
            int currentValue = currentSum % 10; //当前值
            upvalue = currentSum >= 10 ? 1 : 0; //进位值
 
            //currentNode.val = currentValue;  //发现用当前值总会在末尾多new一个，所以不这样了
            currentNode.next = new ListNode(currentValue);
            currentNode = currentNode.next;
 
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        return headNode.next;
 
    }
}
