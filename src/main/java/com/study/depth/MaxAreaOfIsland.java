package com.study.depth;

public class MaxAreaOfIsland {
  public static void main(String[] args) {
    int[][] matrix = {{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
    System.out.println(maxAreaOfIsland(matrix));
  }

  public static int maxAreaOfIsland(int[][] matrix) {
    int max = 0;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 1) {
          max = Math.max(max, crawl(matrix, i, j));
        }
      }
    }
    return max;
  }

  public static int crawl(int[][] matrix, int i, int j) {
    if (i >= 0 && i < matrix.length && j >= 0 && matrix[0].length > j && matrix[i][j] == 1) {
      matrix[i][j] = 0;
      return 1 + crawl(matrix, i + 1, j) + crawl(matrix, i - 1, j) + crawl(matrix, i, j + 1) + crawl(matrix, i, j - 1);
    }
    return 0;
  }
}
