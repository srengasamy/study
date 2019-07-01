package heap;

import java.util.*;

public class TopKFrequent2 {
  public List<String> topKFrequent(String[] words, int k) {
    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }
    PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>((o1, o2) -> {
      if (o1.getValue().intValue() == o2.getValue().intValue()) {
        return o2.getKey().compareTo(o1.getKey());
      }
      return o1.getValue() - o2.getValue();
    });
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      heap.add(entry);
      if (heap.size() > k) {
        heap.poll();
      }
    }
    List<String> results = new ArrayList<>();
    while (!heap.isEmpty()) {
      results.add(heap.poll().getKey());
    }
    Collections.reverse(results);
    return results;
  }

  public static void main(String[] args) {
    System.out.println(new TopKFrequent2().topKFrequent(new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"}, 4));
  }
}
