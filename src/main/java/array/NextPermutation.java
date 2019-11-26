package array;

public class NextPermutation {

  public void nextPermutation(int[] nums) {
    int n = nums.length;
    int j = n - 2;
    while (j >= 0 && nums[j] >= nums[j + 1]) {
      j--;
    }
    if (j >= 0) {
      int i = n - 1;
      while (i >= 0 && nums[i] <= nums[j]) {
        i--;
      }
      int t = nums[j];
      nums[j] = nums[i];
      nums[i] = t;
    }
    for (int l = j + 1, r = n - 1; l < r; ) {
      int t = nums[l];
      nums[l] = nums[r];
      nums[r] = t;
    }
  }

  public static void main(String[] args) {
    new NextPermutation().nextPermutation(new int[]{1, 2});
  }
}
