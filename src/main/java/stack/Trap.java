package stack;

import java.util.Stack;

public class Trap {
  public int trap3(int[] height) {
    int leftMax = 0;
    int rightMax = 0;
    int i = 0, j = height.length - 1;
    int ans = 0;
    while (i < j) {
      leftMax = Math.max(leftMax, height[i]);
      rightMax = Math.max(rightMax, height[j]);
      if (height[i] < height[j]) {
        ans += (leftMax - height[i]);
        i++;
      } else {
        ans += (rightMax - height[j]);
        j--;
      }
    }
    return ans;
  }

  public int trap2(int[] height) {
    Stack<Integer> stack = new Stack<>();
    int ans = 0;
    int i = 0;
    while (i < height.length) {
      if (stack.isEmpty() || height[stack.peek()] > height[i]) {
        stack.push(i++);
      } else {
        int mid = stack.pop();
        if (stack.isEmpty()) {
          stack.push(i++);
        } else {
          int leftMax = stack.pop();
          ans += (Math.min(height[leftMax], height[i]) - height[mid]) * (i - leftMax - 1);
        }
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(new Trap().trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
  }

  public int trap(int[] height) {
    int[] left = new int[height.length];
    int[] right = new int[height.length];
    for (int i = 0; i < height.length; i++) {
      if (i == 0) {
        left[i] = height[i];
      } else {
        left[i] = Math.max(left[i - 1], height[i]);
      }
    }
    for (int i = height.length - 1; i >= 0; i--) {
      if (i == height.length - 1) {
        right[i] = height[i];
      } else {
        right[i] = Math.max(height[i], right[i + 1]);
      }
    }
    int ans = 0;
    for (int i = 0; i < height.length; i++) {
      ans += (Math.min(left[i], right[i]) - height[i]);
    }
    return ans;
  }
}
