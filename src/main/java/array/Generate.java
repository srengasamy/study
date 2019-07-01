package array;

import java.util.ArrayList;
import java.util.List;

public class Generate {
  public static void main(String[] args) {
    System.out.println(new Generate().prefixesDivBy5(new int[]{1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1}))
    ;
  }

  public List<Boolean> prefixesDivBy5(int[] A) {
    List<Boolean> result = new ArrayList<>();
    int k = 0;
    for (int num : A) {
      k = (k << 1 | num) % 5;
      result.add(k == 0);
    }
    return result;
  }
}
