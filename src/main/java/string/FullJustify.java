package string;

import java.util.ArrayList;
import java.util.List;

public class FullJustify {

  public List<String> fullJustify(String[] words, int maxWidth) {
    List<String> result = new ArrayList<>();
    String row = "";
    for (int i = 0; i < words.length; i++) {
      String word = words[i];
      if (row.length() + word.length() + 1 <= maxWidth) {
        row += " ";
      }
    }
    return result;
  }
}
