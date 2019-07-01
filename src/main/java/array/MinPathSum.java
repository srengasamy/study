package array;

public class MinPathSum {
  public static void main(String[] args) {
    int[][] grid = {
            {1, 3, 1},
            {1, 5, 1},
            {4, 2, 1}};
    System.out.println(new MinPathSum().minPathSum(grid));
  }

  public int minPathSum(int[][] grid) {
    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[r].length; c++) {
        if (r == 0 && c == 0) {
          continue;
        }
        int top = r - 1 > -1 ? grid[r - 1][c] : Integer.MAX_VALUE;
        int left = c - 1 > -1 ? grid[r][c - 1] : Integer.MAX_VALUE;
        if (top < left) {
          grid[r][c] += top;
        } else {
          grid[r][c] += left;
        }
      }
    }
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
    return grid[grid.length - 1][grid[0].length - 1];
  }
}
