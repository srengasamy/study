package array;

public class GenerateMatrix {

  public int[][] generateMatrix(int n) {
    int[][] result = new int[n][n];
    int r = 0, c = 0;
    int direction = 1;
    for (int i = 1; i <= n * n; i++) {
      result[r][c] = i;
      int newR = r, newC = c;
      if (direction == 1) {
        newC++;
      } else if (direction == 2) {
        newR++;
      } else if (direction == 3) {
        newC--;
      } else if (direction == 4) {
        newR--;
      }
      if (newR == n - 1 || newR == n - 1 || result[newR][newC] != 0) { //Change direction
        direction = (direction + 1) % 4;
      }
      if (direction == 1) {
        c++;
      } else if (direction == 2) {
        r++;
      } else if (direction == 3) {
        c--;
      } else if (direction == 4) {
        r--;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[][] result = new GenerateMatrix().generateMatrix(3);
    System.out.println(result);
  }
}
