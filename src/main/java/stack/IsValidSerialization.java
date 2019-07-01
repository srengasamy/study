package stack;

import java.util.Stack;

public class IsValidSerialization {
  public boolean isValidSerialization(String preorder) {
    Stack<String> stack = new Stack<>();
    String[] nodes = preorder.split(",");
    for (String node : nodes) {
      while (node.equals("#") && !stack.isEmpty() && stack.peek().equals(node)) {
        stack.pop();
        if (stack.isEmpty()) {
          return false;
        }
        stack.pop();
      }
      stack.push(node);
    }
    return stack.size() == 1 && stack.peek().equals("#");
  }

  public static void main(String[] args) {
    //System.out.println(new IsValidSerialization().isValidSerialization("9,3,0,6,#,#,5,#,4,#,2,#,#,6,0,#,#,#,#"));
    System.out.println(new IsValidSerialization().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
  }
}
