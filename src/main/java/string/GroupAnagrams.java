package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
    for (String str : strs) {
      Map<Character, Integer> count = new HashMap<>();
      for (char c : str.toCharArray()) {
        count.put(c, count.getOrDefault(c, 0) + 1);
      }
      List<String> words = map.getOrDefault(count, new ArrayList<>());
      words.add(str);
      map.put(count, words);
    }
    List<List<String>> result = new ArrayList<>();
    for (List<String> words : map.values()) {
      result.add(words);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
  }
}
