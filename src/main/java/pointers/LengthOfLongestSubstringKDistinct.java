package pointers;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstringKDistinct {
  public int lengthOfLongestSubstringKDistinct(String s, int k) {
    if (k == 0) {
      return 0;
    }
    int j = 0, i = 0, ans = 0;
    Map<Character, Integer> count = new HashMap<>();
    while (j < s.length()) {
      char add = s.charAt(j);
      count.put(add, count.getOrDefault(add, 0) + 1);
      while (count.size() > k && i < j) {
        char remove = s.charAt(i);
        if (count.get(remove) == 1) {
          count.remove(remove);
        } else {
          count.put(remove, count.get(remove) - 1);
        }
        i++;
      }
      ans = Math.max(ans, j - i + 1);
      j++;
    }
    return ans;
  }

  public static void main(String[] args) {
    System.out.println(new LengthOfLongestSubstringKDistinct().lengthOfLongestSubstringKDistinct("aa", 1));
  }
}
