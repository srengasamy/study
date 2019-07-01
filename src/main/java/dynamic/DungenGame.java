package dynamic;

public class DungenGame {
  public int game(int[][] nums) {
    int m = nums.length - 1, n = nums[0].length - 1;
    int[][] aux = new int[m + 1][n + 1];
    aux[m][n] = Math.max(1, 1 - nums[m][n]);
    for (int j = n - 1; j >= 0; j--) {
      aux[m][j] = Math.max(1, 1 - nums[m][+1]);
    }
    return 1;
  }
}
