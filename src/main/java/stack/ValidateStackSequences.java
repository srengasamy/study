package stack;

import java.util.Stack;

public class ValidateStackSequences {

  public boolean validateStackSequences(int[] pushed, int[] popped) {
    Stack<Integer> stack = new Stack<>();
    int j = 0;
    for (int num : pushed) {
      stack.push(num);
      while (j < popped.length && popped[j] == stack.peek()) {
        j++;
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(new ValidateStackSequences().validateStackSequences(new int[]{1, 2, 3, 4, 5}, new int[]{4,5,3,2,1}));
  }
}
