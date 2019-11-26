package string;

import java.util.Stack;

public class ParseBoolExpr {

  public boolean parseBoolExpr(String expression) {
    Stack<Character> stack = new Stack<>();
    for (int i = expression.length() - 1; i >= 0; i--) {
      char c = expression.charAt(i);
      if (c == ',') {
        continue;
      }
      if (c == '(' || c == ')' || c == 't' || c == 'f') {
        stack.push(c);
      } else if (c == '!') {
        stack.pop();
        char top = stack.pop();
        stack.pop();
        stack.push(top == 't' ? 'f' : 't');
      } else if (c == '&') {
        stack.pop();
        boolean result = true;
        while (stack.peek() != ')') {
          result = stack.pop() == 't' && result;
        }
        stack.pop();
        stack.push(result ? 't' : 'f');
      } else if (c == '|') {
        stack.pop();
        boolean result = false;
        while (stack.peek() != ')') {
          result = stack.pop() == 't' || result;
        }
        stack.pop();
        stack.push(result ? 't' : 'f');
      }
    }
    return stack.pop() == 't';
  }

  public static void main(String[] args) {
    System.out.println(new ParseBoolExpr().parseBoolExpr("|(&(t,f,t),!(t))"));
  }
}
