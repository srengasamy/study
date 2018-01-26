package com.study.pointer;

import java.util.Stack;

public class Trap {
  public static void main(String[] args) {
    int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    System.out.println(trapWithStack(height));
  }

  public static int trap(int[] height) {
    int total = 0;
    int leftMax = 0, rightMax = 0;
    for (int l = 0, r = height.length - 1; l < r; ) {
      if (height[l] < height[r]) {
        leftMax = Math.max(leftMax, height[l]);
        total += leftMax - height[l++];
      } else {
        rightMax = Math.max(rightMax, height[r]);
        total += rightMax - height[r--];
      }
    }
    return total;
  }

  public static int trapWithStack(int[] height) {
    Stack<Integer> stack = new Stack<>();
    int total = 0;
    for (int i = 0; i < height.length; ) {
      if (stack.isEmpty() || height[stack.peek()] >= height[i]) stack.push(i++);
      else {
        int top = stack.pop();
        if (stack.isEmpty()) continue;
        int distance = i - stack.peek() - 1;
        total += (Math.min(height[stack.peek()], height[i]) - height[top]) * distance;
      }
    }
    return total;
  }
}
