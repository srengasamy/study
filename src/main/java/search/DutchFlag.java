package search;

public class DutchFlag {
  public static void main(String[] args) {
    int[] nums = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
    int l = 0;
    int m = 0;
    int r = nums.length - 1;
    while (m < r) {
      if (nums[m] == 1) {
        m++;
        continue;
      }
      if (nums[m] == 0) {
        int t = nums[l];
        nums[l] = nums[m];
        nums[m] = t;
        l++;
        m++;
        continue;
      }
      if (nums[r] == 2) {
        r--;
        continue;
      }
      int t = nums[m];
      nums[m] = nums[r];
      nums[r] = t;
    }
    System.out.println();
  }
}
