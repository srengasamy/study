package array;

public class GenerateMatrix {

  public int[][] generateMatrix(int n) {
    int[][] result = new int[n][n];
    if (n == 0) {
      return result;
    }
    int R = n;
    int C = n;
    int r = 0, c = 0, d = 0;
    int[] dr = {0, 1, 0, -1};
    int[] dc = {1, 0, -1, 0};
    boolean[][] seen = new boolean[R][C];
    for (int i = 1; i <= R * C; i++) {
      result[r][c] = i;
      seen[r][c] = true;
      int rc = r + dr[d];
      int cc = c + dc[d];
      if (rc >= 0 && rc < R && cc >= 0 && cc < C && !seen[rc][cc]) {
        r = rc;
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
    int[][] result = new GenerateMatrix().generateMatrix(3);
    System.out.println(result);
  }
}
