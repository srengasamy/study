package string;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
  public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> count = new HashMap<>();
    int i = 0, j = 0;
    int max = Integer.MIN_VALUE;
    while (i < s.length()) {
      char c = s.charAt(i);
      count.put(c, count.getOrDefault(c, 0) + 1);
      while (count.get(c) > 1 && j < i) {
        count.put(s.charAt(j), count.get(s.charAt(j)) - 1);
        j++;
      }
      max = Math.max(max, i - j + 1);
      i++;
    }
    return max;
  }

  public static void main(String[] args) {
    System.out.println(new LengthOfLongestSubstring().lengthOfLongestSubstring(" abcdegaaaa"));
  }
}
