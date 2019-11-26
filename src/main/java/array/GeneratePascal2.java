package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratePascal2 {

  public List<Integer> getRow(int rowIndex) {
    if (rowIndex == 0) {
      return Collections.EMPTY_LIST;
    }
    List<Integer> last = Arrays.asList(1);
    for (int i = 0; i < rowIndex - 1; i++) {
      List<Integer> row = new ArrayList<>();
      for (int j = 0; j < last.size() - 1; j++) {
        row.add(last.get(j) + last.get(j + 1));
      }
      row.add(0, 1);
      row.add(1);
      last = row;
    }
    return last;
  }

  public static void main(String[] args) {
    System.out.println(new GeneratePascal2().getRow(5));
  }
}
