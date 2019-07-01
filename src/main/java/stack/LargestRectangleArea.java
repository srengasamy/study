package stack;

import java.util.Stack;

public class LargestRectangleArea {
  public int largestRectangleArea(int[] heights) {
    Stack<Integer> stack = new Stack<>();
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < heights.length; i++) {
      if (stack.isEmpty() || heights[stack.peek()] < heights[i]) {
        stack.push(i);
      } else {
        while (!stack.isEmpty() && heights[stack.peek()] > heights[i]) {
          int d = i - stack.pop() + 1;
          max = Math.max(max, d * heights[i]);
        }
        stack.push(i);
      }
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(new LargestRectangleArea().largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
  }
}
