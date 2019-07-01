package stack;

import java.util.Stack;

public class Find132pattern {
  public boolean find132pattern(int[] nums) {
    Stack<Integer> stack = new Stack<>();
    int[] min = new int[nums.length];
    min[0] = nums[0];
    for (int i = 1; i < nums.length; i++) {
      min[i] = Math.min(min[i - 1], nums[i]);
    }
    for (int j = nums.length - 1; j >= 0; j--) {
      while (!stack.isEmpty()) {
        int k = stack.pop();
        if (min[j] < k && k < nums[j]) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(new Find132pattern().find132pattern(new int[]{3, 1, 4, 2}));
  }
}
