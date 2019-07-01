package heap;

import java.util.*;

public class TopKFrequent {
  public static void main(String[] args) {
    System.out.println(new TopKFrequent().topKFrequent(new int[]{1}, 1));
  }

  public List<Integer> topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }
    PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> o1.getValue() - o2.getValue());
    queue.addAll(map.entrySet());
    while (queue.size() != k) {
      queue.poll();
    }
    List<Integer> result = new ArrayList<>();
    while (!queue.isEmpty()) {
      result.add(queue.poll().getKey());
    }
    Collections.reverse(result);
    return result;
  }
}
