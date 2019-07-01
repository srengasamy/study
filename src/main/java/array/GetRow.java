package array;

import java.util.ArrayList;
import java.util.List;

public class GetRow {
  public static void main(String[] args) {
    System.out.println(new GetRow().getRow(4));
  }

  public List<Integer> getRow(int rowIndex) {
    List<Integer> result = new ArrayList<>();
    result.add(1);
    for (int i = 1, num = 1; i <= rowIndex; i++) {
      num = Math.round(num * ((rowIndex - (i - 1) + 0.0f) / i));
      result.add(num);
    }
    return result;
  }
}
