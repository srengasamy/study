package dynamic;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
  public boolean wordBreak(String s, List<String> wordDict) {
    int n = s.length();
    boolean[] aux = new boolean[n + 1];
    aux[0] = true;
    for (int j = 1; j <= n; j++) {
      for (int i = 0; i < j; i++) {
        String word = s.substring(i, j);
        if (wordDict.contains(word) && aux[i]) {
          aux[j] = true;
        }
      }
    }
    return aux[n];
  }

  public static void main(String[] args) {
    System.out.println(new WordBreak().wordBreak("", Arrays.asList("cats", "dog", "sand", "and", "cat")));
  }
}
