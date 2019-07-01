package dynamic;

import java.util.Arrays;
import java.util.List;

public class MinimumTotal {
  public int minimumTotal(List<List<Integer>> triangle) {
    if (triangle.isEmpty()) {
      return 0;
    }
    int m = triangle.size();
    int n = triangle.get(triangle.size() - 1).size();
    int[][] aux = new int[m][n];
    aux[0][0] = triangle.get(0).get(0);
    for (int i = 1; i < triangle.size(); i++) {
      List<Integer> last = triangle.get(i - 1);
      List<Integer> rows = triangle.get(i);
      Arrays.fill(aux[i], Integer.MAX_VALUE);
      for (int j = 0; j < last.size(); j++) {
        aux[i][j] = Math.min(aux[i][j], aux[i - 1][j] + rows.get(j));
        aux[i][j + 1] = Math.min(aux[i][j + 1], aux[i - 1][j] + rows.get(j + 1));
      }
    }
    int result = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      result = Math.min(result, aux[m - 1][i]);
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(new MinimumTotal().minimumTotal(Arrays.asList(Arrays.asList(2), Arrays.asList(3, 4), Arrays.asList(6, 5, 7), Arrays.asList(4, 1, 8, 3))));
  }
}
