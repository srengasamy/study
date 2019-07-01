package search;

public class ShuffleArray {
  public static void main(String[] args) {
    int nums[] = {1, 2, 3, 4, 5, 6, 7, 8};
    shuffle(nums, 0, nums.length - 1);
    System.out.println();
  }

  public static void shuffle(int[] nums, int l, int r) {
    if (l + 1 == r) {
      int t = nums[l];
      nums[l] = nums[r];
      nums[r] = t;
      return;
    }
    int mid = (l + r) / 2;
    int lMid = (l + mid) / 2;
    for (int i = lMid + 1, j = mid + 1; i <= mid; i++, j++) {
      int t = nums[i];
      nums[i] = nums[j];
      nums[j] = t;
    }
    shuffle(nums, l, mid);
    shuffle(nums, mid + 1, r);
  }
}
