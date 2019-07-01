package string;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {
  public String minWindow(String s, String t) {
    Map<Character, Integer> count = new HashMap<>();
    Map<Character, Integer> found = new HashMap<>();
    for (int i = 0; i < t.length(); i++) {
      count.put(t.charAt(i), count.getOrDefault(t.charAt(i), 0) + 1);
    }
    int matched = 0;
    int min = Integer.MAX_VALUE;
    String result = "";
    for (int i = 0, j = 0; j < s.length(); j++) {
      char c = s.charAt(j);
      if (!count.containsKey(c)) {
        continue;
      }
      found.put(c, found.getOrDefault(c, 0) + 1);
      if (found.get(c) <= count.get(c)) {
        matched++;
      }
      if (matched != t.length()) {
        continue;
      }
      while (i <= j && matched == t.length()) {
        if (j - i + 1 < min) {
          min = j - i + 1;
          result = s.substring(i, j + 1);
        }
        char ch = s.charAt(i);
        if (found.containsKey(ch)) {
          found.put(ch, found.get(ch) - 1);
          if (found.get(ch) < count.get(ch)) {
            matched--;
          }
        }
        i++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    String s = "ab";
    String t = "";
    System.out.println(new MinWindow().minWindow(s, t));
  }
}
