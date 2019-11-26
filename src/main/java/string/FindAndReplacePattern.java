package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern {
  public List<String> findAndReplacePattern(String[] words, String pattern) {
    List<String> result = new ArrayList<>();
    for (String word : words) {
      if (word.length() != pattern.length()) {
        continue;
      }
      Map<Character, Character> map = new HashMap<>();
      int i = 0;
      while (i < word.length()) {
        char p = pattern.charAt(i);
        if (map.containsKey(p)) {
          if (word.charAt(i) != map.get(p)) {
            break;
          }
        } else {
          if (map.values().contains(word.charAt(i))) {
            break;
          }
          map.put(p, word.charAt(i));
        }
        i++;
      }
      if (i == word.length()) {
        result.add(word);
      }
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new FindAndReplacePattern().findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
  }
}
