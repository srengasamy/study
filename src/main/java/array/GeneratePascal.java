package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneratePascal {
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    result.add(Arrays.asList(1));
    for (int i = 0; i < numRows - 1; i++) {
      List<Integer> last = result.get(i);
      List<Integer> row = new ArrayList<>();
      if (last.size() >= 2) {
        for (int j = 0; j < last.size() - 1; j++) {
          row.add(last.get(j) + last.get(j + 1));
        }
      }
      row.add(0, 1);
      row.add(1);
      result.add(row);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new GeneratePascal().generate(5));
  }
}
