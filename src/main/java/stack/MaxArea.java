package stack;

import java.util.Stack;

public class MaxArea {
  public static void main(String[] args) {
    System.out.println(new MaxArea().largestRectangleArea2(new int[]{2, 1, 5, 6, 2, 3}));
  }

  public int largestRectangleArea2(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < heights.length; i++) {
      while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
        int top = stack.pop();
        int distance = stack.isEmpty() ? i - top : i - stack.peek() + 1;
        int min = stack.isEmpty() ? heights[top] : heights[stack.peek()];
        max = Math.max(max, distance * min);
      }
      stack.push(i);
    }
    return max;
  }

  public int largestRectangleArea(int[] heights) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < heights.length; i++) {
      int min = heights[i];
      for (int j = i; j >= 0; j--) {
        int distance = i - j + 1;
        min = Math.min(min, heights[j]);
        max = Math.max(max, distance * min);
      }
    }
    return max;
  }
}
