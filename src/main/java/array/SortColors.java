package array;

public class SortColors {

  public void sortColors(int[] nums) {
    int i = 0, j = 0, k = nums.length - 1;
    while (j <= k) {
      if (nums[j] == 1) {
        j++;
      } else if (nums[j] == 0) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
        i++;
        j++;
      } else {
        int t = nums[j];
        nums[j] = nums[k];
        nums[k] = t;
        k--;
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = {2,0,1};
    new SortColors().sortColors(nums);
    System.out.println();
  }
}
