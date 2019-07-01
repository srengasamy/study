package array;

public class FindLengthOfLCIS {
  public static void main(String[] args) {
    System.out.println(new FindLengthOfLCIS().findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    ;
  }

  public int findLengthOfLCIS(int[] nums) {
    int i = 0;
    int max = Integer.MIN_VALUE;
    while (i < nums.length) {
      int left = i;
      while (i + 1 < nums.length && nums[i] < nums[i + 1]) {
        i++;
      }
      max = Math.max(max, i - left + 1);
      i++;
    }
    return max;
  }
}
