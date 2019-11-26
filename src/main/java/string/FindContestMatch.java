package string;

import java.util.ArrayList;
import java.util.List;

public class FindContestMatch {
  public String findContestMatch(int n) {
    List<String> list = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      list.add(String.valueOf(i));
    }
    while (n > 1) {
      List<String> reduced = new ArrayList<>();
      for (int i = 0, j = n - 1; i < n; i++, j--) {
        reduced.add(String.format("(%s,%s)", list.get(i), list.get(j)));
      }
      list = reduced;
      n = n / 2;
    }
    return list.get(0);
  }

  public static void main(String[] args) {
    System.out.println(new FindContestMatch().findContestMatch(16));
  }
}
