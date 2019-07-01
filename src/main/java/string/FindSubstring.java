package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSubstring {
  public List<Integer> findSubstring(String s, String[] words) {
    int w = words[0].length(), start = 0;
    Map<String, Integer> count = new HashMap<>();
    Map<String, Integer> found = new HashMap<>();
    List<String> segs = new ArrayList<>();
    List<Integer> results = new ArrayList<>();
    for (String word : words) {
      count.put(word, count.getOrDefault(word, 0) + 1);
    }
    for (int i = 0; i < s.length(); i += w) {
      String word = s.substring(i, Math.min(i + w, s.length()));
      segs.add(word);
    }
    for (int i = 0; i < segs.size(); i++) {
      found.put(segs.get(i), found.getOrDefault(segs.get(i), 0) + 1);
      if (i >= words.length) {
        String prev = segs.get(i - words.length);
        if (found.get(prev) == 1) {
          found.remove(prev);
        } else {
          found.put(prev, found.get(prev) - 1);
        }
        start += w;
      }
      if (found.equals(count)) {
        results.add(start);
      }
    }
    return results;
  }

  public static void main(String[] args) {
    System.out.println(new FindSubstring().findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo", "barr", "wing", "ding", "wing"}));
//    System.out.println(new FindSubstring().findSubstring("wordgoodgoodgoodbestword", new String[]{"word","good","best","word"}));
  }
}
