package stack;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecodeString {

  public String decodeString(String s) {
    Stack<Integer> count = new Stack<>();
    Stack<String> stack = new Stack<>();
    int num = 0;
    for (char c : s.toCharArray()) {
      if (c >= '0' && c <= '9') {
        num = num * 10 + (c - '0');
      } else if (c == '[') {
        stack.push("[");
        count.push(num);
        num = 0;
      } else if (c == ']') {
        StringBuffer sb = new StringBuffer();
        while (!stack.peek().equals("[")) {
          sb.insert(0, stack.pop());
        }
        stack.pop();
        int n = count.pop();
        stack.push(IntStream.range(0, n).mapToObj(idx -> sb.toString()).collect(Collectors.joining()));
      } else {
        if (stack.isEmpty() || stack.peek().equals("[")) {
          stack.push(String.valueOf(c));
        } else {
          stack.push(stack.pop() + c);
        }
      }
    }
    StringBuffer sb = new StringBuffer();
    while (!stack.isEmpty()) {
      sb.insert(0, stack.pop());
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new DecodeString().decodeString("12[e]"));
  }
}
