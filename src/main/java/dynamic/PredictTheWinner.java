package dynamic;

public class PredictTheWinner {

  public boolean predictTheWinner(int[] nums) {
    int n = nums.length;
    int[][] aux = new int[n][n];
    for (int k = 0; k <= n; k++) {
      for (int i = 0, j = k; j <n; i++, j++) {
        int one = i + 2 <= j ? aux[i + 2][j] : 0;
        int two = i <= j - 2 ? aux[i][j - 2] : 0;
        int three = i + 1 <= j - 1 ? aux[i + 1][j - 1] : 0;
        aux[i][j] = Math.max(nums[i] + Math.min(one, three), nums[j] + Math.min(two, three));
      }
    }
    int total = 0;
    for (int num : nums) {
      total += num;
    }
    return aux[0][n - 1] >= (total / 2.0);
  }

  public static void main(String[] args) {
    System.out.println(new PredictTheWinner().predictTheWinner(new int[]{1, 3, 1}));
  }
}
