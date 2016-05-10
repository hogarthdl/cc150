/**
 * Created by hogarth on 2016/5/10.
 * 3.5 Implement a MyQueue class which implements a queue using two stacks.
 */

import java.util.Stack;
 
public class Solution {
      Stack<Integer> stack1 = new Stack<Integer>();
      Stack<Integer> stack2 = new Stack<Integer>();
         
      public void push(int node) {
          stack1.push(new Integer(node));
      }
         
      public int pop() {
          if (stack2.isEmpty()) {
               while (!stack1.isEmpty()) {
                   stack2.push(stack1.pop());
                    
              }
           }
           return stack2.pop().intValue();
       
      }
}



