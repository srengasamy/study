package array;

import java.util.ArrayList;
import java.util.List;

public class CommonChars {

  public static void main(String[] args) {
    System.out.println(new CommonChars().commonChars(new String[]{"cool", "lock", "cook"}));
  }

  public List<String> commonChars(String[] A) {
    int[][] count = new int[A.length][26];
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length(); j++) {
        count[i][A[i].charAt(j) - 'a']++;
      }
    }
    List<String> result = new ArrayList<>();
    for (int i = 0; i < 26; i++) {
      int min = Integer.MAX_VALUE;
      for (int j = 0; j < count.length; j++) {
        min = Math.min(min, count[j][i]);
      }
      while (min > 0) {
        result.add(((char) (i + 'a')) + "");
        min--;
      }
    }
    return result;
  }
}
