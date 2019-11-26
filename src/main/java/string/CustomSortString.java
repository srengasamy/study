package string;

import java.util.ArrayList;
import java.util.List;

public class CustomSortString {
  public String customSortString(String S, String T) {
    List<Character> chars = new ArrayList<>();
    for (char c : T.toCharArray()) {
      chars.add(c);
    }
    StringBuffer sb = new StringBuffer();
    for (char c : S.toCharArray()) {
      while (chars.contains(c)) {
        sb.append(c);
        chars.remove((Character) c);
      }
    }
    for (char c : chars) {
      sb.append(c);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    System.out.println(new CustomSortString().customSortString("kqep", "pekeq"));
  }
}
