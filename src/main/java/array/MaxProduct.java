package array;

public class MaxProduct {
  public static void main(String[] args) {
    System.out.println(new MaxProduct().maxProduct(new int[]{-2, 0, -1}));
  }

  public int maxProduct(int[] nums) {
    int max = Integer.MIN_VALUE;
    Integer maxSoFar = null;
    for (int num : nums) {
      if (maxSoFar == null) {
        maxSoFar = num;
      } else {
        maxSoFar *= num;
      }
      max = Math.max(max, maxSoFar);
      if (maxSoFar < 0) {
        maxSoFar = num;
      }
    }
    return max;
  }
}
