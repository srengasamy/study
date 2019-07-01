package stack;

import java.util.Stack;

public class MinStack {
  private Stack<Integer> stack = new Stack<>();
  private Stack<Integer> min = new Stack<>();

  public MinStack() {

  }

  public void push(int x) {
    stack.push(x);
    if (min.isEmpty() || min.peek() > x) {
      min.push(x);
    }
  }

  public void pop() {
    int pop = stack.pop();
    if (min.peek() == pop) {
      min.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min.peek();
  }

  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(-2);
    minStack.push(0);
    minStack.push(-3);
    System.out.println(minStack.getMin());;
    minStack.pop();
    System.out.println(minStack.top());;
    System.out.println();;
  }
}
