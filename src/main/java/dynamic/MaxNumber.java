package dynamic;

public class MaxNumber {
  public int[] maxNumber(int[] nums1, int[] nums2, int k) {
    int n = nums1.length, m = nums2.length;
    int[] ans = new int[k];
    for (int i = Math.max(0, k - m); i <= k && i <= n; i++) {
      int[] local = merge(getMax(nums1, i), getMax(nums2, k - i), k);
      if (greater(local, 0, ans, 0)) {
        ans = local;
      }
    }
    return ans;
  }

  public int[] merge(int[] nums1, int[] nums2, int k) {
    int[] result = new int[k];
    for (int i = 0, j = 0, r = 0; r < k; r++) {
      result[r] = greater(nums1, i, nums2, j) ? nums1[i++] : nums2[j++];
    }
    return result;
  }

  public boolean greater(int[] nums1, int i, int[] nums2, int j) {
    while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
      i++;
      j++;
    }
    return j == nums2.length || i < nums1.length && nums1[i] > nums2[j];
  }

  public int[] getMax(int[] nums, int k) {
    int[] result = new int[k];
    int top = 0, i = 0;
    while (i < nums.length) {
      while (nums.length - i + top > k && result[top - 1] < nums[i]) {
        top--;
      }
      if (top < k) {
        result[top++] = nums[i++];
      }
    }
    return result;
  }
}
