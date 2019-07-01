package heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
  public String frequencySort(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    PriorityQueue<Map.Entry<Character, Integer>> queue = new PriorityQueue<>((k1, k2) -> k2.getValue() - k1.getValue());
    queue.addAll(map.entrySet());
    StringBuffer sb = new StringBuffer();
    while (!queue.isEmpty()) {
      Map.Entry<Character, Integer> key = queue.poll();
      for (int i = 0; i < key.getValue(); i++) {
        sb.append(key.getKey());
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new FrequencySort().frequencySort("Aabb"));
  }
}
