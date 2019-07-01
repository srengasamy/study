package stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExclusiveTime {

  public int[] exclusiveTime(int n, List<String> logs) {
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();
    int prev = -1;
    for (String log : logs) {
      String[] parts = log.split(":");
      int pid = Integer.parseInt(parts[0]);
      int timestamp = Integer.parseInt(parts[2]);
      if (stack.isEmpty()) {
        stack.push(pid);
        prev = timestamp;
        continue;
      }
      if (parts[1].equals("start")) {
        result[stack.peek()] += timestamp - prev;
        stack.push(pid);
        prev = timestamp;
      } else {
        result[stack.peek()] += timestamp - prev + 1;
        stack.pop();
        prev = timestamp + 1;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] result = new ExclusiveTime().exclusiveTime(2, Arrays.asList("0:start:0", "1:start:2", "1:end:5", "0:end:6"));
    System.out.println(result);
  }
}
