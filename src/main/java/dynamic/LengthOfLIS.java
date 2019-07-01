package dynamic;

public class LengthOfLIS {
  public int lengthOfLIS(int[] nums) {
    int[] aux = new int[nums.length];
    aux[0] = 1;
    int result = 1;
    for (int i = 1; i < nums.length; i++) {
      int max = 1;
      for (int j = i - 1; j >= 0; j--) {
        if (nums[j] < nums[i] && aux[j] + 1 > max) {
          max = aux[j] + 1;
        }
      }
      result = Math.max(result, max);
      aux[i] = max;
    }
    return aux[nums.length - 1];
  }

  public static void main(String[] args) {
    System.out.println(new LengthOfLIS().lengthOfLIS(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}));
  }
}
