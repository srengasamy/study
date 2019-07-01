package divide;

public class ReversePair {
  public static void main(String[] args) {
    int[] nums = {4, 2, 5, 3, 1};
    System.out.println(reversePair(nums, 0, nums.length - 1));
  }

  public static int reversePair(int[] nums, int start, int end) {
    if (start >= end) {
      return 0;
    }
    int mid = (start + end) / 2;
    int count = reversePair(nums, start, mid) + reversePair(nums, mid + 1, end);
    for (int i = mid + 1; i <= end; i++) {
      count += count(nums, start, mid, 2 * nums[i]);
    }
    int[] result = new int[end - start + 1];
    int i = start;
    int j = mid + 1;
    int k = 0;
    while (i <= mid && j <= end) {
      if (nums[i] <= nums[j]) {
        result[k++] = nums[i++];
      } else {
        result[k++] = nums[j++];
      }
    }
    while (i <= mid) {
      result[k++] = nums[i++];
    }
    while (j <= end) {
      result[k++] = nums[j++];
    }
    for (i = 0; i < result.length; i++) {
      nums[start++] = result[i];
    }
    return count;
  }

  public static int count(int[] nums, int start, int end, int val) {
    if (start > end) {
      return 0;
    }
    int mid = (start + end) / 2;
    if (nums[mid] > val) {
      return (end - mid) + 1 + count(nums, start, mid - 1, val);
    }
    return count(nums, mid + 1, end, val);
  }

}
