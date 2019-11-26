package array;

import java.util.HashMap;
import java.util.Map;

public class ShortestDistance {
  public int shortestDistance(String[] words, String word1, String word2) {
    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < words.length; i++) {
      map.put(words[i], i);
    }
    return Math.abs(map.get(word1) - map.get(word2));
  }

  public static void main(String[] args) {
    System.out.println(new ShortestDistance().shortestDistance(new String[]{"a", "a", "b", "b"}, "a", "B"));
  }
}
