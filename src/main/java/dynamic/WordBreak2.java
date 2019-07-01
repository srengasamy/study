package dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak2 {
  public List<String> wordBreak(String s, List<String> wordDict) {
    int n = s.length();
    List<String>[] aux = new List[n + 1];
    aux[0] = Arrays.asList("");
    for (int j = 1; j <= n; j++) {
      List<String> list = new ArrayList<>();
      for (int i = 0; i < j; i++) {
        if (aux[i].size() > 0 && wordDict.contains(s.substring(i, j))) {
          for (String l : aux[i]) {
            list.add(l + (l.equals("") ? "" : " ") + s.substring(i, j));
          }
        }
      }
      aux[j] = list;
    }
    return aux[n];
  }

  public static void main(String[] args) {
    System.out.println(new WordBreak2().wordBreak("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa")));
  }
}
