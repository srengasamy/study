package string;

import java.util.*;

public class MostCommonWord {
  public String mostCommonWord(String paragraph, String[] banned) {
    Set<String> sets = new HashSet<>(Arrays.asList(banned));
    Map<String, Integer> count = new HashMap<>();
    for (String word : paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+")) {
      if (!sets.contains(word)) {
        count.put(word, count.getOrDefault(word, 0) + 1);
      }
    }
    return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
  }

  public static void main(String[] args) {
    System.out.println(new MostCommonWord().mostCommonWord("Bob", new String[]{}));
  }
}
