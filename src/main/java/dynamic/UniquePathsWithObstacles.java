package dynamic;

public class UniquePathsWithObstacles {
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int[][] aux = new int[m][n];
    for (int i = 1; i < m; i++) {
      if (obstacleGrid[i][0] == 1) {
        break;
      }
      aux[i][0] = 1;
    }

    for (int j = 0; j < n; j++) {
      if (obstacleGrid[0][j] == 1) {
        break;
      }
      aux[0][j] = 1;
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        if (obstacleGrid[i][j] == 1) {
          continue;
        }
        aux[i][j] = aux[i - 1][j] + aux[i][j - 1];
      }
    }
    return aux[m - 1][n - 1];
  }


  public static void main(String[] args) {
    int[][] nums = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};

    UniquePathsWithObstacles u = new UniquePathsWithObstacles();
    System.out.println(u.uniquePathsWithObstacles(nums));
  }
}
