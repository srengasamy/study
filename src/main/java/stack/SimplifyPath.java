package stack;

import java.util.Stack;

public class SimplifyPath {

  public static void main(String[] args) {
    System.out.println(new SimplifyPath().simplifyPath("/a//b////c/d//././/.."));
  }

  public String simplifyPath(String path) {
    Stack<String> stack = new Stack<>();
    String[] dirs = path.split("/");
    for (String dir : dirs) {
      if (dir.equals(".") || dir.isEmpty()) {
        continue;
      }
      if (dir.equals("..")) {
        if (stack.isEmpty()) {
          continue;
        }
        stack.pop();
      } else {
        stack.push(dir);
      }
    }
    StringBuffer sb = new StringBuffer();
    while (!stack.isEmpty()) {
      sb.insert(0, "/" + stack.pop());
    }
    if (sb.length() == 0) {
      return "/";
    }
    return sb.toString();
  }
}
