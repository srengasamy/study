package stack;

import java.util.Stack;

public class ValidSubarrays {
  public int validSubarrays(int[] nums) {
    Stack<Integer> stack = new Stack<>();
    int result = 0;
    for (int num : nums) {
      while (!stack.isEmpty() && stack.peek() > num) {
        stack.pop();
      }
      stack.push(num);
      result += stack.size();
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new ValidSubarrays().validSubarrays(new int[]{15, 1, 15, 20, 10, 17, 19, 17}));
  }
}
