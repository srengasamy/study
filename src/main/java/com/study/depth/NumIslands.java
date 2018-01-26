package com.study.depth;

public class NumIslands {
  public static void main(String[] args) {
    char[][] grid = {
            {'1', '1', '1', '1', '0'},
            {'1', '1', '0', '1', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '1'}
    };
    System.out.println(numIslands(grid));
  }

  public static int numIslands(char[][] grid) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == '0') continue;
        result++;
        process(grid, i, j);
      }
    }
    return result;
  }

  public static void process(char[][] grid, int i, int j) {
    grid[i][j] = '0';
    if (i + 1 < grid.length && grid[i + 1][j] == '1') process(grid, i + 1, j);
    if (j + 1 < grid[0].length && grid[i][j + 1] == '1') process(grid, i, j + 1);
    if (i - 1 >= 0 && grid[i - 1][j] == '1') process(grid, i - 1, j);
    if (j - 1 >= 0 && grid[i][j - 1] == '1') process(grid, i, j - 1);
  }
}
