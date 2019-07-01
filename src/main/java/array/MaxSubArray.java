package array;

public class MaxSubArray {

  public static void main(String[] args) {
    System.out.println(new MaxSubArray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
  }

  public int maxSubArray(int[] nums) {
    int max = Integer.MIN_VALUE;
    int maxSoFar = 0;
    for (int i = 0; i < nums.length; i++) {
      maxSoFar += nums[i];
      max = Math.max(max, maxSoFar);
      if (maxSoFar < 0) {
        maxSoFar = 0;
      }
    }
    return max;
  }

}
