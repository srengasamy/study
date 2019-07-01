package heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class MaxSlidingWindow {

  public int[] maxSlidingWindow(int[] nums, int k) {
    if(nums.length == 0){
      return new int[0];
    }
    PriorityQueue<Integer> queue = new PriorityQueue<>(((o1, o2) -> o2 - o1));
    List<Integer> result = new ArrayList<>();
    int left = 0, right = 0;
    while (right < k) {
      queue.add(nums[right++]);
    }
    result.add(queue.peek());
    while (right < nums.length) {
      queue.add(nums[right++]);
      queue.remove(nums[left++]);
      result.add(queue.peek());
    }
    int[] res = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
      res[i] = result.get(i);
    }
    return res;
  }

  public static void main(String[] args) {
    int[] result = new MaxSlidingWindow().maxSlidingWindow(new int[]{}, 0);
    for (int num : result) {
      System.out.println(num);
    }
  }
}
