package stack;

import java.util.Stack;

public class ParseTernary {
  public String parseTernary(String expression) {
    Stack<Character> stack = new Stack<>();
    for (int i = expression.length() - 1; i >= 0; i--) {
      char c = expression.charAt(i);
      if (!stack.isEmpty() && stack.peek() == '?') {
        stack.pop();
        char a = stack.pop();
        stack.pop();
        char b = stack.pop();
        if (c == 'T') {
          stack.push(a);
        } else {
          stack.push(b);
        }
      } else {
        stack.push(c);
      }
    }
    return stack.pop() + "";
  }

  public static void main(String[] args) {
    System.out.println(new ParseTernary().parseTernary("F?T:F?T?1:2:F?3:4"));
  }
}
