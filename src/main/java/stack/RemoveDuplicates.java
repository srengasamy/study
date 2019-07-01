package stack;

import java.util.Stack;

public class RemoveDuplicates {
  public String removeDuplicates2(String S) {
    char[] chars = S.toCharArray();
    int i = -1;
    for (int j = 0; j < S.length(); j++) {
      if (i == -1 || chars[i] != S.charAt(j)) {
        chars[++i] = S.charAt(j);
      } else {
        i--;
      }
    }
    StringBuffer sb = new StringBuffer();
    for (int k = 0; k <= i; k++) {
      sb.append(chars[k]);
    }
    return sb.toString();
  }

  public String removeDuplicates(String S) {
    Stack<Character> stack = new Stack<>();
    for (char c : S.toCharArray()) {
      if (stack.isEmpty() || stack.peek() != c) {
        stack.push(c);
      } else {
        stack.pop();
      }
    }
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < stack.size(); i++) {
      sb.append(stack.get(i));
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new RemoveDuplicates().removeDuplicates2("abbaca"));
  }
}
