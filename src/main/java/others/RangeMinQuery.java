package others;

public class RangeMinQuery {
  public static void main(String[] args) {
    int[] nums = {7, 2, 3, 0, 5, 10, 3, 12, 18};
    int[][] lookup = new int[nums.length][nums.length];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        lookup[i][j] = nums[lookup[i][j - 1]] < nums[j] ? lookup[i][j - 1] : j;
      }
    }
    System.out.println(nums[lookup[7][8]]);
  }
}
