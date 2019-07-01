package dynamic;

public class MaxKilledEnemies {

  public int maxKilledEnemies(char[][] grid) {
    int max = 0;
    int m = grid.length;
    int n = grid[0].length;
    int row = 0;
    int[] cols = new int[n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (j == 0 || grid[i][j - 1] == 'W') {
          row = 0;
          for (int k = j; k < n && grid[i][k] != 'W'; k++) {
            if (grid[i][k] == 'E') {
              row++;
            }
          }
        }
        if (i == 0 || grid[i - 1][j] == 'W') {
          for (int k = i; k < m && grid[k][j] != 'W'; k++) {
            if (grid[k][j] == 'E') {
              cols[j]++;
            }
          }
        }
        if (grid[i][j] == '0') {
          max = Math.max(max, row + cols[j]);
        }
      }
    }
    return max;
  }
}
