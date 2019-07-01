package stack;

import java.util.Stack;

public class IsValid2 {
  public boolean isValid(String S) {
    Stack<Character> stack = new Stack<>();
    for (char c : S.toCharArray()) {
      if (c == 'a' || c == 'b') {
        stack.push(c);
      } else {
        if (stack.isEmpty() || stack.peek() != 'b') {
          return false;
        }
        stack.pop();
        if (stack.isEmpty() || stack.peek() != 'a') {
          return false;
        }
        stack.pop();
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    System.out.println(new IsValid2().isValid("abccba"));
  }
}
