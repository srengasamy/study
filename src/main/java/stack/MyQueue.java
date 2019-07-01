package stack;

import java.util.Stack;

public class MyQueue {
  Stack<Integer> left = new Stack<>();
  Stack<Integer> right = new Stack<>();

  /**
   * Initialize your data structure here.
   */
  public MyQueue() {

  }

  /**
   * Push element x to the back of queue.
   */
  public void push(int x) {
    left.push(x);
  }

  /**
   * Removes the element from in front of queue and returns that element.
   */
  public int pop() {
    if (!right.isEmpty()) {
      return right.pop();
    }
    while (!left.isEmpty()) {
      right.push(left.pop());
    }
    return right.pop();
  }

  /**
   * Get the front element.
   */
  public int peek() {
    if (!right.isEmpty()) {
      return right.peek();
    }
    while (!left.isEmpty()) {
      right.push(left.pop());
    }
    return right.peek();
  }

  /**
   * Returns whether the queue is empty.
   */
  public boolean empty() {
    return left.isEmpty() && right.isEmpty();
  }

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.push(1);
    queue.push(2);
    System.out.println(queue.peek());  // returns 1
    System.out.println(queue.pop());   // returns 1
    System.out.println(queue.empty()); // returns false
  }
}
