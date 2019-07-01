package heap;

import java.util.PriorityQueue;

public class KthLargest {
  PriorityQueue<Integer> queue = new PriorityQueue<>();
  int k;

  public KthLargest(int k, int[] nums) {
    this.k = k;
    for (int num : nums) {
      add(num);
    }
  }

  public int add(int val) {
    if (queue.size() < k) {
      queue.add(val);
    } else if (queue.peek() > val) {
      queue.poll();
      queue.add(val);
    }
    return queue.peek();
  }

  public static void main(String[] args) {
    KthLargest largest = new KthLargest(3, new int[]{4, 5, 8, 2});
    largest.add(3);
    largest.add(5);
    largest.add(10);
    largest.add(9);
    largest.add(4);
  }
}
