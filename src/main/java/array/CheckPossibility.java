package array;

public class CheckPossibility {

  public static void main(String[] args) {
    System.out.println(new CheckPossibility().checkPossibility(new int[]{1, 2, 9, 3, 3, 4}));
  }

  public boolean checkPossibility(int[] nums) {
    int i = 0;
    int leftMax = Integer.MIN_VALUE;
    int rightMin = Integer.MAX_VALUE;
    while (i < nums.length - 1 && nums[i] <= nums[i + 1]) {
      leftMax = nums[i];
      i++;
    }
    for (int j = i + 2; j < nums.length - 1; j++) {
      if (nums[j] > nums[j + 1]) {
        return false;
      }
    }
    if (i + 2 < nums.length) {
      rightMin = nums[i + 2];
    }
    return (leftMax <= nums[i] && nums[i] <= rightMin) || (leftMax <= nums[i + 1] && nums[i + 1] <= rightMin);
  }
}
