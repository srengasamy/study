package string;

import java.util.ArrayList;
import java.util.List;

public class CamelMatch {

  public static void main(String[] args) {
    System.out.println(new CamelMatch().camelMatch(new String[]{"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"}, "FoBaT"));
  }

  public List<Boolean> camelMatch(String[] queries, String pattern) {
    List<Boolean> results = new ArrayList<>();
    for (String query : queries) {
      results.add(match(query, pattern));
    }
    return results;
  }

  public boolean match(String word, String pattern) {
    int p = 0, w = 0;
    while (w < word.length()) {
      if (p < pattern.length() && word.charAt(w) == pattern.charAt(p)) {
        p++;
      } else if (word.charAt(w) >= 'A' && word.charAt(w) <= 'Z') {
        return false;
      }
      w++;
    }
    return p == pattern.length();
  }
}
