package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Stack<Integer> stack = new Stack<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums2.length; i++) {
      while (!stack.isEmpty() && stack.peek() < nums2[i]) {
        map.put(stack.pop(), nums2[i]);
      }
      stack.push(nums2[i]);
    }
    for (int i = 0; i < nums1.length; i++) {
      nums1[i] = map.getOrDefault(nums1[i], -1);
    }
    return nums1;
  }

  public static void main(String[] args) {
    int[] res = new NextGreaterElement().nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4});

    System.out.println(res);
  }
}
