package array;

import java.util.HashSet;
import java.util.Set;

public class NumMagicSquaresInside {

  public static void main(String[] args) {
    int[][] grid = {{4, 3, 8, 4},
            {9, 5, 1, 9},
            {2, 7, 6, 2}};
    System.out.println(new NumMagicSquaresInside().numMagicSquaresInside(grid));
  }

  public int numMagicSquaresInside(int[][] grid) {
    int R = grid.length;
    int C = grid[0].length;
    int ans = 0;
    for (int r = 0; r < R - 2; r++) {
      for (int c = 0; c < C - 2; c++) {
        Set<Integer> sum = new HashSet<>();
        sum.add(grid[r][c] + grid[r][c + 1] + grid[r][c + 2]);
        sum.add(grid[r + 1][c] + grid[r + 1][c + 1] + grid[r + 1][c + 2]);
        sum.add(grid[r + 2][c] + grid[r + 2][c + 1] + grid[r + 2][c + 2]);
        sum.add(grid[r][c] + grid[r + 1][c] + grid[r + 2][c]);
        sum.add(grid[r][c + 1] + grid[r + 1][c + 1] + grid[r + 2][c + 1]);
        sum.add(grid[r][c + 2] + grid[r + 1][c + 2] + grid[r + 2][c + 2]);
        sum.add(grid[r][c] + grid[r + 1][c + 1] + grid[r + 2][c + 2]);
        sum.add(grid[r][c + 2] + grid[r + 1][c + 1] + grid[r + 2][c]);
        if (sum.size() == 1 && sum.contains(15)) {
          ans++;
        }
      }
    }
    return ans;
  }
}
