package array;

public class FindStartOfRotated {

  public int start(int[] nums, int lo, int hi) {
    if (lo == hi) {
      return nums[lo];
    }
    int mid = (lo + hi) / 2;
    if (nums[lo] <= nums[mid] && nums[mid] > nums[hi]) {
      return start(nums, mid + 1, hi);
    } else if (nums[mid] <= nums[hi] && nums[lo] > nums[mid]) {
      return start(nums, lo, mid);
    }
    return nums[lo];
  }

  public int end(int[] nums, int lo, int hi) {
    if (lo == hi) {
      return lo;
    }
    int mid = (lo + hi) / 2;
    if (nums[lo] <= nums[mid] && nums[mid] > nums[hi]) {
      return end(nums, mid, hi - 1);
    } else if (nums[mid] <= nums[hi] && nums[lo] > nums[mid]) {
      return end(nums, lo, mid - 1);
    }
    return hi;
  }

  public static void main(String[] args) {
    int[] nums = new int[]{3, 3, 1, 3};
    System.out.println(new FindStartOfRotated().start(nums, 0, nums.length - 1));
  }
}
