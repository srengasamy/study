package heap;

import java.util.PriorityQueue;

public class FindKthLargest {
  public static void main(String[] args) {
    System.out.println(new FindKthLargest().findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
  }

  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> min = new PriorityQueue<>();
    for (int num : nums) {
      if (min.size() < k) {
        min.add(num);
      } else if (min.peek() < num) {
        min.add(num);
        min.poll();
      }
    }
    return min.poll();
  }
}
