package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpiralOrder {
  public List<Integer> spiralOrder(int[][] matrix) {
    if (matrix.length == 0) {
      return Collections.EMPTY_LIST;
    }
    List<Integer> result = new ArrayList<>();
    int R = matrix.length;
    int C = matrix[0].length;
    boolean[][] seen = new boolean[R][C];
    int c = 0, r = 0, d = 0;
    int[] dr = {0, 1, 0, -1};
    int[] dc = {1, 0, -1, 0};
    for (int i = 0; i < R * C; i++) {
      result.add(matrix[r][c]);
      seen[r][c] = true;
      int cr = r + dr[d];
      int cc = c + dc[d];
      if (cr >= 0 && cr < R && cc >= 0 && cc < C && !seen[cr][cc]) {
        r = cr;
        c = cc;
      } else {
        d = (d + 1) % 4;
        r += dr[d];
        c += dc[d];
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}};
    System.out.println(new SpiralOrder().spiralOrder(nums));

  }
}
