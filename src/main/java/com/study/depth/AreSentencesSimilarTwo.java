package com.study.depth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AreSentencesSimilarTwo {
  public static void main(String[] args) {
    String[] words1 = {"a", "very", "delicious", "meal"};
    String[] words2 = {"one", "really", "delicious", "dinner"};
    String[][] pairs = {{"great", "good"}, {"extraordinary", "good"}, {"well", "good"}, {"wonderful", "good"}, {"excellent", "good"}, {"fine", "good"}, {"nice", "good"}, {"any", "one"}, {"some", "one"}, {"unique", "one"}, {"the", "one"}, {"an", "one"}, {"single", "one"}, {"a", "one"}, {"truck", "car"}, {"wagon", "car"}, {"automobile", "car"}, {"auto", "car"}, {"vehicle", "car"}, {"entertain", "have"}, {"drink", "have"}, {"eat", "have"}, {"take", "have"}, {"fruits", "meal"}, {"brunch", "meal"}, {"breakfast", "meal"}, {"food", "meal"}, {"dinner", "meal"}, {"super", "meal"}, {"lunch", "meal"}, {"possess", "own"}, {"keep", "own"}, {"have", "own"}, {"extremely", "very"}, {"actually", "very"}, {"really", "very"}, {"super", "very"}};
    System.out.println(areSentencesSimilarTwo(words1, words2, pairs));
  }

  public static boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
    if (words1.length != words2.length) return false;
    Map<String, Set<String>> words = new HashMap<>();
    for (int i = 0; i < pairs.length; i++) {
      Set<String> matches = new HashSet<>();
      for (int j = 0; j < pairs[0].length; j++)
        if (words.containsKey(pairs[i][j])) matches.addAll(words.get(pairs[i][j]));
      matches.addAll(Arrays.asList(pairs[i]));
      for (String key : matches) words.put(key, matches);
    }
    for (int i = 0; i < words1.length; i++) {
      if (words1[i].equals(words2[i])) continue;
      if (!words.containsKey(words1[i]) || !words.containsKey(words2[i]) || words.get(words1[i]) != words.get
              (words2[i])) return false;
    }
    return true;
  }
}
