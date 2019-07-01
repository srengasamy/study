package stack;

import java.util.Stack;

public class ScoreOfParentheses {
  public int scoreOfParentheses(String S) {
    Stack<Integer> stack = new Stack<>();
    stack.push(0);
    for (char c : S.toCharArray()) {
      if (c == '(') {
        stack.push(0);
      } else {
        int v = stack.pop();
        int w = stack.pop();
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    System.out.println(new ScoreOfParentheses().scoreOfParentheses("(()(()))()"));
  }
}
