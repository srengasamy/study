package com.study.pointer;

import java.util.Arrays;
import java.util.List;

public class FindLongestWord {
  public static void main(String[] args) {
    String s = "aaa";
    List<String> d = Arrays.asList("aaa", "aa", "a");
    System.out.println(findLongestWord(s, d));
  }

  public static String findLongestWord(String s, List<String> d) {
    int[] next = new int[d.size()];
    int[] found = new int[256];
    String result = "";
    for (int i = 0; i < d.size(); i++) {
      found[d.get(i).charAt(0)]++;
    }
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (found[c] == 0) continue;
      for (int j = 0; j < d.size(); j++) {
        String word = d.get(j);
        if (next[j] < 0 || word.charAt(next[j]) != c) continue;
        if (next[j] + 1 == word.length() &&
                (word.length() > result.length()
                        || (word.length() == result.length() && word.compareTo(result) < 0))) {
          result = word;
          next[j] = -1;
        }
        found[c]--;
        if (next[j] + 1 < word.length()) found[d.get(j).charAt(++next[j])]++;
      }
    }
    return result;
  }
}
