package stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
  Queue<Integer> left = new LinkedList<>();
  Queue<Integer> right = new LinkedList<>();
  int top = -1;

  /**
   * Initialize your data structure here.
   */
  public MyStack() {

  }

  /**
   * Push element x onto stack.
   */
  public void push(int x) {
    left.add(x);
    top = x;
  }

  /**
   * Removes the element on top of the stack and returns that element.
   */
  public int pop() {
    while (left.size() > 1) {
      right.offer(left.poll());
    }
    int top = left.poll();
    Queue<Integer> temp = left;
    left = right;
    right = temp;
    return top;
  }

  /**
   * Get the top element.
   */
  public int top() {
    return top;
  }

  /**
   * Returns whether the stack is empty.
   */
  public boolean empty() {
    return left.isEmpty() && right.isEmpty();
  }

  public static void main(String[] args) {
    MyStack stack = new MyStack();

    stack.push(1);
    stack.push(2);
    System.out.println(stack.top());   // returns 2
    stack.push(3);
    System.out.println(stack.pop());   // returns 2
  }
}