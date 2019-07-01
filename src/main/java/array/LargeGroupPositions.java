package array;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {

  public static void main(String[] args) {
    System.out.println(new LargeGroupPositions().largeGroupPositions("abcdddeeeeaabbbcd"));
  }

  public List<List<Integer>> largeGroupPositions(String S) {
    List<List<Integer>> result = new ArrayList<>();
    int i = 0;
    while (i < S.length()) {
      int left = i;
      while (i + 1 < S.length() && S.charAt(i + 1) == S.charAt(i)) {
        i++;
      }
      if (i - left + 1 >= 3) {
        List<Integer> temp = new ArrayList<>();
        temp.add(left);
        temp.add(i);
        result.add(temp);
      }
      i++;
    }
    return result;
  }
}
