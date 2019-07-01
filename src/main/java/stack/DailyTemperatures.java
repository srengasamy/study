package stack;

import java.util.Stack;

public class DailyTemperatures {

  public int[] dailyTemperatures(int[] T) {
    Stack<Integer> stack = new Stack<>();
    int[] result = new int[T.length];
    for (int i = 0; i < T.length; i++) {
      while (!stack.isEmpty() && T[stack.peek()] < T[i]) {
        int top = stack.pop();
        result[top] = i - top;
      }
      stack.add(i);
    }
    return result;
  }

  public static void main(String[] args) {
    new DailyTemperatures().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
  }
}
