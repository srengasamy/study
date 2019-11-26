package array;

public class SearchRange {

  public int[] searchRange(int[] nums, int target) {
    return new int[]{first(nums, 0, nums.length - 1, target), last(nums, 0, nums.length - 1, target)};
  }

  public int last(int[] nums, int lo, int hi, int target) {
    if (lo > hi) {
      return -1;
    }
    int mid = (lo + hi) / 2;
    if ((hi == mid && nums[mid] == target) || (nums[mid] == target && nums[mid] < nums[mid + 1])) {
      return mid;
    }
    if (nums[mid] <= target) {
      return last(nums, mid + 1, hi, target);
    }
    return last(nums, lo, mid - 1, target);
  }

  public int first(int[] nums, int lo, int hi, int target) {
    if (lo > hi) {
      return -1;
    }
    int mid = (lo + hi) / 2;
    if ((lo == mid && nums[lo] == target) || (nums[mid] == target && nums[mid - 1] < nums[mid])) {
      return mid;
    }
    if (target <= nums[mid]) {
      return first(nums, lo, mid - 1, target);
    }
    return first(nums, mid + 1, hi, target);
  }

  public static void main(String[] args) {
    int[] nums = {2, 2};
    System.out.println(new SearchRange().first(nums, 0, nums.length - 1, 2));
  }
}
