package stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElements {

  public int[] nextGreaterElements(int[] nums) {
    Stack<Integer> next = new Stack<>();
    int[] max = new int[nums.length];
    Arrays.fill(max, -1);
    for (int i = 0; i < nums.length; i++) {
      while (!next.isEmpty() && nums[next.peek()] < nums[i]) {
        max[next.pop()] = nums[i];
      }
      next.push(i);
    }
    return max;
  }

  public static void main(String[] args) {
    int[] res = new NextGreaterElements().nextGreaterElements(new int[]{1, 2, 1});
    System.out.println(res);
  }

}
